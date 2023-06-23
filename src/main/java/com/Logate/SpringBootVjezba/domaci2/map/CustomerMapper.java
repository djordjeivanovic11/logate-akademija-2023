package com.Logate.SpringBootVjezba.domaci2.map;

import com.Logate.SpringBootVjezba.domaci2.dto.CustomerDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CustomerMapper {
    @Mapping(source="fullName", target="imePrezime")

    CustomerDTO convertCustomerToCustomerDTO(Customer customer);

    @Mapping(source="imePrezime", target="fullName")
    Customer convertCustomerDTOToCustomer(CustomerDTO customer);

}
