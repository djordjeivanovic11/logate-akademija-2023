package com.Logate.SpringBootVjezba.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="users")
public class User {
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(name="username")
    private String userName;
    @Column
    private String address;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="department_name")
    private Integer departmentId;

    @ManyToOne
    @JoinTable(
            name="user_roles",
            joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
    )
    private Set<User> role = new HashSet<>();

}
