package com.Logate.SpringBootVjezba;

import org.springframework.stereotype.Component;


public class User {
    private Integer id;
    private String fullName;
    private String address;

    public User(Integer id, String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
