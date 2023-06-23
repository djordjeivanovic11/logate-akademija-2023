package com.Logate.SpringBootVjezba.repositories;

import com.Logate.SpringBootVjezba.Application;
import com.Logate.SpringBootVjezba.entities.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest (classes= Application.class)
class IUserInterfaceTest {
    /*

    @Autowired
    IUserInterface userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(IUserInterfaceTest.class);

    @Test
    void findByDepartmentDescriptionAndFirstNameEager () {
        String departmentName = "IT";
        String userName = "sradenovic";
        List<User> users = userRepository.findByDepartmentDescriptionAndFirstName(departmentName, userName);
        for (User user : users) {
            LOGGER.info("User userName je : {}", user.toString());

        }
    }
    @Test
    @Transactional
    void getByDepartmentDescriptionAndFirstName () {
            String departmentName = "IT";
            String description = "descp";
            List<User> users = userRepository.getByDepartmentDescriptionAndName(departmentName, description);
            for(User user:users){
                LOGGER.info("User userName je : {}", user.getDepartment().getDepartmentName());
                LOGGER.info("User userName je : {}", user.getDepartment().getDescription());
            }
    }

    @Test
    void findByFirstName () {
        String firstName = "Stefan";
        List<User> users = userRepository.getUserByFisrtName(firstName);
        for (User user : users) {
            LOGGER.info("User userName je : {}", user.getName());
        }
    }

*/
}