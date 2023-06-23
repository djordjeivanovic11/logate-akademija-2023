package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.Department;
import com.Logate.SpringBootVjezba.maps.DepartmentMapper;
import com.Logate.SpringBootVjezba.repositories.DepartmentRepository;
import jakarta.persistence.Cacheable;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentMapper departmentMapper;

/*

    @Cacheable(value= "departments", key= "all")
    public List<DepartmentDTO> listAll(){
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map(departmentMapper::convertDepartmentToDepartmentDTO).toList();
    }

    @Cacheable(value= "departments", key= "all")
    public List<DepartmentDTO> listById(Integer id){
        List<Department> departments = departmentRepository.findById(id).orElseThrow(EntityExistsException::new);
        return departmentMapper.convertDepartmentToDepartmentDTO(department);
    }

    */
}
