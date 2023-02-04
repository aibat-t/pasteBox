package kz.aibat.pasteBox.controller;

import kz.aibat.pasteBox.dto.PasteBoxDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class PasteBoxController {

    @GetMapping("/")
    public List<String> getPasteList( ) {
        return Collections.emptyList();
    }

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable(name = "hash") String hash) {
        return hash;
    }

    @PostMapping("/")
    public String addNewPaste(@RequestBody PasteBoxDTO pasteBoxDTO) {
        return pasteBoxDTO.getData();
    }
}
