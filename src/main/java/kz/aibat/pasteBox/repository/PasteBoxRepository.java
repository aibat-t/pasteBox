package kz.aibat.pasteBox.repository;

import kz.aibat.pasteBox.enums.PublicStatus;
import kz.aibat.pasteBox.model.PasteBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PasteBoxRepository extends JpaRepository<PasteBox, Long> {
    PasteBox findByHash(String hash);
    List<PasteBox> findAllByStatusOrderByExpirationTimeSecondsDesc(PublicStatus status);
}
