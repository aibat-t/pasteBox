package kz.aibat.pasteBox.model;

import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PasteBox {
    @Id
    private Long id;

    @Column(name = "data")
    private String data;

    @Column
    private Long expirationTimeSeconds;

    @Column(name = "status")
    private PublicStatus status;
}
