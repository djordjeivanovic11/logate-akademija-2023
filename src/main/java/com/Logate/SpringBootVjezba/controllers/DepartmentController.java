package com.Logate.SpringBootVjezba.controllers;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.Department;
import com.Logate.SpringBootVjezba.maps.DepartmentMapper;
import com.Logate.SpringBootVjezba.services.DepartmentService;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="api/departments")
public class DepartmentController {
    /*

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentMapper departmentMapper;
/*
    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> listAll(){
        List<Department> departments = departmentService.listAll();
        return new ResponseEntity<>(departments, HttpStatus.OK);

    }*/
}
