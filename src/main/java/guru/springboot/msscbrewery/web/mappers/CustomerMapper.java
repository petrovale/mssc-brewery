package guru.springboot.msscbrewery.web.mappers;

import guru.springboot.msscbrewery.domain.Customer;
import guru.springboot.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

  Customer customerDtoToCustomer(CustomerDto dto);

  CustomerDto customerToCustomerDto(Customer customer);
}
