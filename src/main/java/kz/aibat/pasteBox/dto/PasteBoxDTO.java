package kz.aibat.pasteBox.dto;

import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

import javax.persistence.Column;

@Data
public class PasteBoxDTO {

    private String data;

    private Long expirationTimeSeconds;

    private PublicStatus status;
}
