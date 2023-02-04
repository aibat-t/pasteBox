package kz.aibat.pasteBox.controller;

import kz.aibat.pasteBox.dto.request.PasteBoxRequestDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxUrlDTO;
import kz.aibat.pasteBox.service.PasteBoxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PasteBoxController {

    private final PasteBoxService pasteBoxService;

    @GetMapping("/")
    public List<PasteBoxResponseDTO> getPasteList( ) {
        return pasteBoxService.getPublicPasteBoxList();
    }

    @GetMapping("/{hash}")
    public PasteBoxResponseDTO getByHash(@PathVariable(name = "hash") String hash) {
        return pasteBoxService.getByHash(hash);
    }

    @PostMapping("/")
    public PasteBoxUrlDTO addNewPaste(@RequestBody PasteBoxRequestDTO pasteBoxRequestDTO) {
        return pasteBoxService.create(pasteBoxRequestDTO);
    }
}
