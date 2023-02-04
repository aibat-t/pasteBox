package kz.aibat.pasteBox.mapper;

import kz.aibat.pasteBox.dto.PasteBoxDTO;
import kz.aibat.pasteBox.model.PasteBox;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PasteBoxMapper {
    PasteBoxDTO pasteBoxToDTO(PasteBox pasteBox);

    List<PasteBoxDTO> pasteBoxListToDTOList(List<PasteBox> pasteBoxList);

    PasteBox dtoToPasteBox(PasteBoxDTO pasteBoxDTO);

    List<PasteBox> dtoListToPasteBoxList(List<PasteBoxDTO> pasteBoxDTOList);
}
