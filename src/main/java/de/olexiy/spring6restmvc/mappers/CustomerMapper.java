package de.olexiy.spring6restmvc.mappers;

import de.olexiy.spring6restmvc.entities.Customer;
import de.olexiy.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
