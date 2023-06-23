package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.DTO.UserCreateDTO;
import com.Logate.SpringBootVjezba.DTO.UserDTO;
import com.Logate.SpringBootVjezba.Filters.UserFilter;
import com.Logate.SpringBootVjezba.User;
import com.Logate.SpringBootVjezba.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service//@Services @repository @RestController
public class UserService {


    /*DependencyIncjection na nivou konstruktora
        public UserService(ProductService productService) {
            this.productService = productService;
        }
     */

    /*@Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }*/
    /*Ili na nivou setera isto sa autowired*/

    @Autowired
    private ProductService productService;
    /*na nivou atributa koristeci @Autowired*/
    @Autowired
    @Qualifier("user")
    private User user;

    public void printUser() {
        user.toString();
    }

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserById(Integer id) {
        List<UserDTO> users = userRepository.getAllUsers();
        for (UserDTO user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<UserDTO> getUserByName(String fullName) {
        return userRepository.getUserByName(fullName);
    }


    public List<UserDTO> getUserByNameAndAddress(Map<String, String> params) {
        List<UserDTO> users = userRepository.getAllUsers();
        List<UserDTO> result = new ArrayList<>();
        for (UserDTO user : users) {
            if (user.getFullName().contains(params.get("fullName")) && user.getAddress().contains(params.get("address"))) {
                result.add(user);
            }
        }
        return result;

    }

    public List<UserDTO> getUserByNameAndAddressClassBased(UserFilter userFilter) {
        List<UserDTO> users = userRepository.getAllUsers();
        List<UserDTO> result = new ArrayList<>();
        for (UserDTO user : users) {
            if (user.getFullName().contains(userFilter.getFullName()) && user.getAddress().contains(userFilter.getAddress())) {
                result.add(user);
            }
        }
        return result;

    }

    public UserDTO createUser(UserCreateDTO userCreateDTO) {
        UserDTO user = new UserDTO(3, userCreateDTO.getFullName(), userCreateDTO.getAddress());
        return user;
    }

   /* public UserDTO updateUser(UserCreateDTO userCreateDTO, Integer id) {


    }

    */



}
