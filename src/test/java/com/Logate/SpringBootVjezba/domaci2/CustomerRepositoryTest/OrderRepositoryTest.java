package com.Logate.SpringBootVjezba.domaci2.CustomerRepositoryTest;

import com.Logate.SpringBootVjezba.domaci2.dto.CustomerDTO;
import com.Logate.SpringBootVjezba.domaci2.dto.OrderDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Customer;
import com.Logate.SpringBootVjezba.domaci2.entities.Order;
import com.Logate.SpringBootVjezba.domaci2.entities.OrderItem;
import com.Logate.SpringBootVjezba.domaci2.repositories.OrderRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Logate.SpringBootVjezba.Application;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = Application.class)
public class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryTest.class);

    @Test
    void createOrder(){
        Order order = new Order();
        order.setTotatPrice(24.5);
        order.setStatus(Order.Status.DONE);
        order.setCustomer(new Customer(5,"Petar Petrovic"));
        orderRepository.save(order);
        LOGGER.info("kreiran je order {}", order.getId(), order.getStatus());



    }
    @Test
    void updateOrder(){
        Order order = new Order();
        order.setTotatPrice(24.5);
        order.setStatus(Order.Status.DONE);
        order.setCustomer(new Customer(5,"Petar Petrovic"));
        orderRepository.save(order);
        LOGGER.info("kreiran je order {}", order.getId(), order.getStatus());

    }
    @Test
    void deleteSomethingFromOrder(){
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        OrderItem item1 = new OrderItem(2, 500);
        OrderItem item2 = new OrderItem(5, 40);
        OrderItem item3 = new OrderItem(1, 500);
        orderItems.add(item1);
        orderItems.add(item2);
        orderItems.add(item3);
        Order order = new Order(344, new Customer(88, "Dejan Dedic"), 544.67, Order.Status.IN_PROGRESS, orderItems );
        orderRepository.save(order);

        ArrayList<OrderItem> orderItemsNew = new ArrayList<>();
        OrderItem itemN = new OrderItem(2, 500);
        orderItemsNew.add(itemN);

        orderRepository.getById(344).setOrderItems(orderItemsNew);



    }
    @Test
    void deleteOrder(){
        orderRepository.deleteById(344);
    }

    @Test
    void changeStatus(){
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        OrderItem item1 = new OrderItem(2, 500);
        OrderItem item2 = new OrderItem(5, 40);
        OrderItem item3 = new OrderItem(1, 500);
        orderItems.add(item1);
        orderItems.add(item2);
        orderItems.add(item3);
        Order order = new Order(343, new Customer(88, "Dejan Pekic"), 5448.67, Order.Status.DONE, orderItems );
        orderRepository.save(order);
        orderRepository.getById(88).setStatus(Order.Status.REJECTED);

    }



}
