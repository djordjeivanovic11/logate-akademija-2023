package com.Logate.SpringBootVjezba.repositories;

import com.Logate.SpringBootVjezba.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {


    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = new ArrayList<>();

        UserDTO user1 = new UserDTO(1, "Djordje Ivanovic", "Podgorica");
        UserDTO user2 = new UserDTO(2, "Petar Jokic", "Podgorica");
        users.add(user1);
        users.add(user2);
        return users;


    }

    public List<UserDTO> getUserByName(String fullName) {
        List<UserDTO> users = getAllUsers();
        List<UserDTO> usersResult = new ArrayList<>();
        for (UserDTO user: users) {
            if (user.getFullName().contains(fullName)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }

}
