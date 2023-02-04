package kz.aibat.pasteBox.service;

import kz.aibat.pasteBox.dto.request.PasteBoxRequestDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxUrlDTO;

import java.util.List;

public class PasteBoxServiceImpl implements PasteBoxService {
    @Override
    public PasteBoxResponseDTO getByHash(String hash) {
        return null;
    }

    @Override
    public List<PasteBoxResponseDTO> getPublicPasteBoxList(int amount) {
        return null;
    }

    @Override
    public PasteBoxUrlDTO create(PasteBoxRequestDTO request) {
        return null;
    }
}
