package com.Logate.SpringBootVjezba.controllers;

import com.Logate.SpringBootVjezba.DTO.UserCreateDTO;
import com.Logate.SpringBootVjezba.DTO.UserDTO;
import com.Logate.SpringBootVjezba.Filters.UserFilter;
import com.Logate.SpringBootVjezba.Filters.UserSearchFilter;
import com.Logate.SpringBootVjezba.User;
import com.Logate.SpringBootVjezba.repositories.UserRepository;
import com.Logate.SpringBootVjezba.services.UserService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/api/users")
public class UserController {



    public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id){
        UserDTO user = userService.getUserById(id);
        if(user == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping(value="search-by-name")
    public ResponseEntity<List<UserDTO>> getUserbyName(@RequestParam String fullName){
       List<UserDTO> users = userService.getUserByName(fullName);
       return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value="search-by--and-address")
    public ResponseEntity<List<UserDTO>> getUserByNameAndAddress(@RequestParam Map<String,String> params){
        LOGGER.info("Parametar koji predajemo je {}", params.get("fullName"));
        LOGGER.info("Parametar koji predajemo je {}", params.get("address"));
        List<UserDTO> users = userService.getUserByNameAndAddress(params);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value="search-by-query-classbased")
    public ResponseEntity<List<UserDTO>> getUserByNameAndAddressClassBased(UserFilter userFilter){
        LOGGER.info("Parametar koji predajemo class-om je {}", userFilter);
        List<UserDTO> users = userService.getUserByNameAndAddressClassBased(userFilter);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(value="")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserCreateDTO userCreateDTO) {
        LOGGER.info("User kojeg smo napravili je {}", userCreateDTO);
        UserDTO user = userService.createUser(userCreateDTO);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /*@PutMapping(value="{id}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserCreateDTO userCreateDTO, @PathVariable Integer id) {
        LOGGER.info("Request body je {}", userCreateDTO);
        UserDTO user = userService.updateUser(userCreateDTO);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }*/

    @GetMapping(value="headers")
    public ResponseEntity<Void> checkHeaders(@RequestHeader(value="CLIENTSECRET") String header){
        LOGGER.info("Request body je {}", header);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping(value="headers-return")
    public ResponseEntity<Void> returnHeaders(@RequestHeader(value="CLIENTSECRET") String header){
        HttpHeaders httpHeader = new HttpHeaders();
        httpHeader.add("CLIENTSECRET", header);
        LOGGER.info("Request body je {}", header);
        return new ResponseEntity<>(httpHeader, HttpStatus.NO_CONTENT);
    }

   /* @GetMapping(value="paging")
    public ResponseEntity<Void> requestWithPaging(Pageable pageable){
        userService.getAllUserPage(pageable);
        return ResponseEntity(HttpStatus.OK);
    }
    @GetMapping(value="search-filter")
    public ResponseEntity<Void> search(UserSearchFilter userSearchFilter) {
        userService,search(userSearchFilter);
    }*/

}
