package guru.springboot.msscbrewery.web.mappers;

import guru.springboot.msscbrewery.domain.Beer;
import guru.springboot.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

  BeerDto beerToBeerDto(Beer beer);

  Beer beerDtoToBeer(BeerDto beerDto);
}
