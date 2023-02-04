package kz.aibat.pasteBox.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PasteBoxRequestDTO {

    private String data;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expirationTimeSeconds;

    private PublicStatus status;
}
