package com.Logate.SpringBootVjezba.domaci2.repositories;

import com.Logate.SpringBootVjezba.domaci2.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
