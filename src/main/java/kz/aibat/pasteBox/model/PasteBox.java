package kz.aibat.pasteBox.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import kz.aibat.pasteBox.enums.PublicStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PublicStatus status;

    @Column(name = "hash")
    private String hash;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasteBox pasteBox = (PasteBox) o;

        if (!Objects.equals(id, pasteBox.id)) return false;
        if (!Objects.equals(data, pasteBox.data)) return false;
        if (!Objects.equals(expirationTimeSeconds, pasteBox.expirationTimeSeconds))
            return false;
        if (status != pasteBox.status) return false;
        return Objects.equals(hash, pasteBox.hash);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (expirationTimeSeconds != null ? expirationTimeSeconds.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (hash != null ? hash.hashCode() : 0);
        return result;
    }
}
