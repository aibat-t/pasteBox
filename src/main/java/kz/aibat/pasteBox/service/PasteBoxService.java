package kz.aibat.pasteBox.service;

import kz.aibat.pasteBox.dto.request.PasteBoxRequestDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxUrlDTO;

import java.util.List;

public interface PasteBoxService {
    PasteBoxResponseDTO getByHash(String hash);
    List<PasteBoxResponseDTO> getPublicPasteBoxList();
    PasteBoxUrlDTO create(PasteBoxRequestDTO request);
}
