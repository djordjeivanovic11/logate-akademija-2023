package com.Logate.SpringBootVjezba.configurations;

import com.Logate.SpringBootVjezba.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UserConfiguration {
   /* @Bean
    public User user(Integer id, String fullName, String address) {
        return new User(1, "Janko Jankovic", "Ulica 13.jula");
    }

    */

    @Bean(name="user")
    public User user() {
        return new User(1, "Janko Jankovic", "Ulica 13.jula");
    }
/*
    @Bean
    @Primary
    public User userNekiTamo() {
        return new User(2, "Petar Perovic", "Blok 5");
    }
    */
}
