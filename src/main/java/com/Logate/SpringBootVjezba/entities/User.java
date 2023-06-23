package com.Logate.SpringBootVjezba.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="users")
public class User {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(name="username")
    private String userName;
    @Column
    private String address;

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name="department_id")
    private Department department;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name="user_roles",
            joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
    )
    private Set<Roles> roles = new HashSet<>();

}
