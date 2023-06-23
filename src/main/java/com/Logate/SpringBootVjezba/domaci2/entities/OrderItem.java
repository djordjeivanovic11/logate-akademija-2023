package com.Logate.SpringBootVjezba.domaci2.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="order_item")
public class OrderItem {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="product_id")
    private Product product;

    public OrderItem(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
