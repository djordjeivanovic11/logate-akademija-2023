package com.Logate.SpringBootVjezba.domaci2.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="order")

public class Order {
    public enum Status {
        CREATED,
        IN_PROGRESS,
        REJECTED,
        DONE;
    }

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<OrderItem> orderItems;

    @Column(name = "total_price")
    private Double totatPrice;

    @Column(columnDefinition = "ENUM('CREATED', 'IN_PROGRESS', 'REJECTED', 'DONE')")
    @Enumerated(EnumType.STRING)
    private Status status;

    public Order(Integer id, Customer customer, Double totatPrice, Status status, ArrayList<OrderItem> orderItems) {
        this.id = id;
        this.orderItems = orderItems;
        this.customer = customer;
        this.totatPrice = totatPrice;
        this.status = status;
    }
}
