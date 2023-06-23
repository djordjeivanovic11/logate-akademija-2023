package com.Logate.SpringBootVjezba.domaci2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String title;

    @Column(name="short_description")
    private String shortDescription;

    @Column(name="long_description")
    private String longDescription;

    @Column
    private Double price;

    @Column(name="created_at")
    private DateTimeAtCreation createdAt;

    @Column(name="is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "product", targetEntity = OrderItem.class)
    private OrderItem orderItem;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="category_id")
    private Category category;

}
