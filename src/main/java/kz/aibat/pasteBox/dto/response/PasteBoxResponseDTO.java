package kz.aibat.pasteBox.dto.response;

import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

@Data
public class PasteBoxResponseDTO {
    private String data;

    private PublicStatus status;
}
