package guru.springboot.msscbrewery.repositories;

import guru.springboot.msscbrewery.domain.Beer;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
