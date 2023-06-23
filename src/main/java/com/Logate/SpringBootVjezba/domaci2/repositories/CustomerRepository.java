package com.Logate.SpringBootVjezba.domaci2.repositories;

import com.Logate.SpringBootVjezba.domaci2.entities.Customer;
import com.Logate.SpringBootVjezba.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
