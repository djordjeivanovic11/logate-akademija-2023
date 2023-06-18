package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes= Application.class)
class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void provjeraIspisaUser() {
        userService.printUser();

    }

}