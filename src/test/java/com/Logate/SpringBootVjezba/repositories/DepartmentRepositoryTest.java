package com.Logate.SpringBootVjezba.repositories;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.Department;
import com.Logate.SpringBootVjezba.entities.User;
import com.Logate.SpringBootVjezba.projection.DepartmentProjection;
import com.Logate.SpringBootVjezba.records.DepartmentRecord;
import jakarta.persistence.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.awt.print.Pageable;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DepartmentRepositoryTest.class)
public class DepartmentRepositoryTest {
    /*

    private final static Logger LOGGER = LoggerFactory.getLogger(DepartmentRepositoryTest.class);
    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    void departmentNameDepartmentDTO(){
        String name = "IT";
        List<DepartmentDTO> departments = departmentRepository.deptNameAndDescDepartmentDTO(name);
            for(DepartmentDTO department : departments) {
                LOGGER.info("Dept name iz DTO je: {}", department.getName());
                LOGGER.info("Dept name iz DTO je: {}", department.getDescription());
            }
    }

    @Test
    void departmentNameDepartmentDTOTuple(){
        String name = "IT";
        List<Tuple> departments = departmentRepository.deptNameAndDescDepartmentDTOTuples(name);
        for(Tuple department : departments) {
            if(department.getElements().isEmpty() != true){
                String nameDept = (String) department.get("name");
                String desc = (String) department.get("description");
            LOGGER.info("Dept name iz DTO je: {}", nameDept);
            LOGGER.info("Dept name iz DTO je: {}", desc);
        }
        }
    }

    @Test
    void departmentNameDepartmentDTOProjection(){
        String name = "IT";
        List<DepartmentProjection> departments = departmentRepository.deptNameAndDescDepartmentDTOProjection(name);
        for(DepartmentProjection department : departments) {
            if(department != null){
                LOGGER.info("Polja su {}", department.getName(), department.getDescription());
            }
        }
    }

    @Test
    void departmentNameDepartmentDTORecord(){
        String name = "IT";
        List<DepartmentRecord> departments = departmentRepository.deptNameAndDescDepartmentDTOProjection(name);
        for(DepartmentRecord department : departments) {
            if(department != null){
                LOGGER.info("Polja su {}", department.name(), department.description());
            }
        }
    }


    /*@Test
    void findByNameWithPagingIssue(){
        String name = "IT";
        Pageable pageable = (Pageable) PageRequest.of(0, 1);
        Page<Department> departments = departmentRepository.findByNameWithPagingIssue(name, pageable);
        List<Department> listaDepartment = departments.getContent();
        for(Department department : listaDepartment){
            LOGGER.info("Dept name: {}", department.toString());
        }
    }*/

   /* @Test
    void findByNameWithPagingIssue(){
        String name = "IT";
        Pageable pageable = (Pageable) PageRequest.of(0, 1);
        Page<Integer> ids = departmentRepository.findByIdsPagingIssueSolved(name, pageable);
        List<Department> departments = departmentRepository.findByNameWithPagingIssue(ids.getContent());
        for(Department department : departments){
            LOGGER.info("Dept name: {}", department.getDepartmentName());
        }
    }*/

}
