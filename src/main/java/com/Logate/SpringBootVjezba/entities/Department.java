package com.Logate.SpringBootVjezba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

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
    @Column(name="description")
    private String description;

    @OneToMany
    private List<User> users;

}
