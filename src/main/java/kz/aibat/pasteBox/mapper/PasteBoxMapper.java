package kz.aibat.pasteBox.mapper;

import kz.aibat.pasteBox.dto.request.PasteBoxRequestDTO;
import kz.aibat.pasteBox.dto.response.PasteBoxResponseDTO;
import kz.aibat.pasteBox.model.PasteBox;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PasteBoxMapper {
    PasteBoxResponseDTO pasteBoxToDTO(PasteBox pasteBox);

    List<PasteBoxResponseDTO> pasteBoxListToDTOList(List<PasteBox> pasteBoxList);

    PasteBox dtoToPasteBox(PasteBoxRequestDTO pasteBoxRequestDTO);

    List<PasteBox> dtoListToPasteBoxList(List<PasteBoxRequestDTO> pasteBoxRequestDTOList);
}
