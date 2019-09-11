package guru.springboot.msscbrewery.services;

import guru.springboot.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID id) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name("Alex")
        .build();
  }
}
