package com.Logate.SpringBootVjezba.Domaci3.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String naziv;
    private String kratkiOpis;
    private String opis;
    private Double cijena;
}
