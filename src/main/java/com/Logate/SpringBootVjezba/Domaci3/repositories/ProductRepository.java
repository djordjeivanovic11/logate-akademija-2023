package com.Logate.SpringBootVjezba.Domaci3.repositories;

import com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select product from Product product " +
            "join product.category " +
            "where category.name = :name")
    List<Product> listAllProductsFromCategory(@Param("name") String name);


    @Query(value = "select product from Product product " +
            "join product.category " +
            "where category.name = :name")
    Page<Product> listAllProductsFromCategoryWithPagination(String name, Pageable pageable);



}
