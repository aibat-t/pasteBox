package kz.aibat.pasteBox.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "paste_box")
public class PasteBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private String data;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expirationTimeSeconds;

    @Column(name = "status")
    private PublicStatus status;

    @Column(name = "hash")
    private String hash;
}
