package kz.aibat.pasteBox.service;

import kz.aibat.pasteBox.dto.request.PasteBoxRequestDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxUrlDTO;
import kz.aibat.pasteBox.enums.PublicStatus;
import kz.aibat.pasteBox.mapper.PasteBoxMapper;
import kz.aibat.pasteBox.model.PasteBox;
import kz.aibat.pasteBox.repository.PasteBoxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PasteBoxServiceImpl implements PasteBoxService {

    private final PasteBoxRepository pasteBoxRepository;
    private final PasteBoxMapper pasteBoxMapper;

    @Value("${app.host}")
    private String host;
    @Value("${app.public_list_size}")
    private int publicListSize;

    @Override
    public PasteBoxResponseDTO getByHash(String hash) {
        return pasteBoxMapper.pasteBoxToDTO(pasteBoxRepository.findByHash(hash));
    }

    @Override
    public List<PasteBoxResponseDTO> getPublicPasteBoxList() {
        LocalDateTime now = LocalDateTime.now();

        List<PasteBox> pasteBoxList = pasteBoxRepository.findAllByStatusOrderByExpirationTimeSecondsDesc(PublicStatus.PUBLIC).stream()
                .filter(pasteBox -> pasteBox.getExpirationTimeSeconds().isAfter(now))
                .sorted(Comparator.comparing(PasteBox::getId).reversed())
                .limit(publicListSize)
                .collect(Collectors.toList());

        return pasteBoxMapper.pasteBoxListToDTOList(pasteBoxList);
    }

    @Override
    public PasteBoxUrlDTO create(PasteBoxRequestDTO request) {

        PasteBox pasteBox = pasteBoxMapper.dtoToPasteBox(request);
        pasteBox.setHash(Integer.toString(pasteBox.hashCode()));

        PasteBox newPasteBox = pasteBoxRepository.save(pasteBox);

        return new PasteBoxUrlDTO(host + "/" +newPasteBox.getHash());
    }
}
