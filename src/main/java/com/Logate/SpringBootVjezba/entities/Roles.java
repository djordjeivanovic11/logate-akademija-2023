package com.Logate.SpringBootVjezba.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")public class Roles {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column(name="role_name")
    private String roleName;
    @Column
    private String description;
    @ManyToMany(mappedBy = "roles", targetEntity = User.class)
    private Set<User> users = new HashSet<>();
}
