package com.Logate.SpringBootVjezba.domaci2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


@Table(name="customer")
public class Customer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "customer", targetEntity = Order.class)
    @JsonIgnore
    private List<Order> orders;

    public Customer(Integer id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
}
