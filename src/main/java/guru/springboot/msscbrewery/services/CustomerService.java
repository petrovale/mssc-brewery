package guru.springboot.msscbrewery.services;

import guru.springboot.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {

  CustomerDto getCustomerById(UUID id);
}
