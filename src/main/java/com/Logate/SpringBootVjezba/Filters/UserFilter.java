package com.Logate.SpringBootVjezba.Filters;

public class UserFilter {
    private String fullName;
    private String address;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserFilter{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
