package com.Logate.SpringBootVjezba.maps;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
         unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface DepartmentMapper {
    /*
    @Mapping(source = "name", target= "name")
    @Mapping(source = "description", target= "description")
    Department converDepartmentDTOToDepartment(DepartmentDTO department);

    @Mapping(source = "name", target= "name")
    @Mapping(source = "description", target= "description")
    DepartmentDTO convertDepartmentToDepartmentDTO(Department department);

    */

}
