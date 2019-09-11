package guru.springboot.msscbrewery.services;

import guru.springboot.msscbrewery.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {

  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);
}
