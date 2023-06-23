package com.Logate.SpringBootVjezba.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="department")
public class Department {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="department_name")
    private String departmentName;
    @Column(name="is_active")
    private Boolean isActive;

    @OneToMany
    private List<User> users;

}
