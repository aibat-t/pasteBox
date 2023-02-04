package kz.aibat.pasteBox.dto.response;

import lombok.Data;

@Data
public class PasteBoxUrlDTO {
    private String url;

    public PasteBoxUrlDTO(String url) {
        this.url = url;
    }
}
