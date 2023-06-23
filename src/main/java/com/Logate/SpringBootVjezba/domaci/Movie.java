package com.Logate.SpringBootVjezba.domaci;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    private Integer id;
    private String title;
    private String description;
    private String genre;
}
