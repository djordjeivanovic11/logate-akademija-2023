package com.Logate.SpringBootVjezba.Domaci3.maps;

import com.Logate.SpringBootVjezba.Domaci3.dto.CategoryDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface CategoryMapper {
    @Mapping(source = "name", target = "ime")
    @Mapping(source = "description", target = "opis")
    CategoryDTO convertCategoryToCategoryDTO(Category category);

    @Mapping(source = "ime", target = "name")
    @Mapping(source = "opis", target = "description")
    Category convertCategoryDTOToCategory(CategoryDTO categoryDTO);

}