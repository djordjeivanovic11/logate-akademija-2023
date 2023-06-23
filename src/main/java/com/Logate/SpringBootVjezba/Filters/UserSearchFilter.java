package com.Logate.SpringBootVjezba.Filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchFilter {
    String firstName;
    String lastName;
    String description;
    String username;
    Integer age;


}
