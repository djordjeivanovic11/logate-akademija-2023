package com.Logate.SpringBootVjezba.Domaci3.maps;

import com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface ProductMapper {

    @Mapping(source = "title", target = "naziv")
    @Mapping(source = "shortDescription", target = "kratkiOpis")
    @Mapping(source = "longDescription", target = "opis")
    @Mapping(source = "price", target = "cijena")
    com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO convertProductToProductDTO(Product poroduct);


    @Mapping(source = "naziv", target = "title")
    @Mapping(source = "kratkiOpis", target = "shortDescription")
    @Mapping(source = "opis", target = "longDescription")
    @Mapping(source = "cijena", target = "price")
    Product convertProductDTOToProduct(ProductDTO productDTO);

}
