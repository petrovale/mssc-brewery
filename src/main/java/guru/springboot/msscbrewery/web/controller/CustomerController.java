package guru.springboot.msscbrewery.web.controller;

import guru.springboot.msscbrewery.services.CustomerService;
import guru.springboot.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("{customerId}")
  public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
    return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
  }
}
