package kz.aibat.pasteBox.dto.request;

import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

@Data
public class PasteBoxRequestDTO {

    private String data;

    private Long expirationTimeSeconds;

    private PublicStatus status;
}
