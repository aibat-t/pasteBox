package kz.aibat.pasteBox;

import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.enums.PublicStatus;
import kz.aibat.pasteBox.model.PasteBox;
import kz.aibat.pasteBox.repository.PasteBoxRepository;
import kz.aibat.pasteBox.service.PasteBoxService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PasteBoxServiceTest {

    @Autowired
    private PasteBoxService pasteBoxService;

    @MockBean
    private PasteBoxRepository pasteBoxRepository;

    @Test
    public void getExistHash() {
        PasteBox entity = new PasteBox();
        entity.setHash("1");
        entity.setData("11");
        entity.setStatus(PublicStatus.PUBLIC);

        when(pasteBoxRepository.findByHash("1")).thenReturn(entity);

        PasteBoxResponseDTO expected = new PasteBoxResponseDTO();
        expected.setData("11");
        expected.setStatus(PublicStatus.PUBLIC);

        PasteBoxResponseDTO actual = pasteBoxService.getByHash("1");

        assertEquals(expected, actual);
    }
}
