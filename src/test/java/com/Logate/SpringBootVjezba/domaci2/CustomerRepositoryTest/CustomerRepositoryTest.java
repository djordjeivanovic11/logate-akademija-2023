package com.Logate.SpringBootVjezba.domaci2.CustomerRepositoryTest;

import com.Logate.SpringBootVjezba.Application;
import com.Logate.SpringBootVjezba.domaci2.dto.CustomerDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Customer;
import com.Logate.SpringBootVjezba.domaci2.map.CustomerMapper;
import com.Logate.SpringBootVjezba.domaci2.repositories.CustomerRepository;
import com.Logate.SpringBootVjezba.entities.Department;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootTest(classes= Application.class)
public class CustomerRepositoryTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryTest.class);
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerRepository customerRepository;

    public CustomerRepositoryTest() {
    }

    @Test
    @Transactional
    void createCustomer() {
        Customer customer = new Customer();
        customer.setFullName("Marija Markovic");
        customerRepository.save(customer);
        LOGGER.info("Kreiran je novi korisnik.");
    }

    @Test
    @Transactional
    void updateCustomer(CustomerDTO customer){
        customer.setImePrezime("Marija Markovic");
        Customer customerDB = customerMapper.convertCustomerDTOToCustomer(customer);
        customerRepository.save(customerDB);
        LOGGER.info("Updateovan je customer.");
    }

    @Test
    @Transactional
    void deleteCustomer(CustomerDTO customer) {
        Customer customerDB = customerMapper.convertCustomerDTOToCustomer(customer);
        customerRepository.save(customerDB);
        customerRepository.deleteById(customerDB.getId());
        LOGGER.info("Customer je obrisan.");
    }

}
