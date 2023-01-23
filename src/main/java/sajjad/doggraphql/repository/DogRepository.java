package sajjad.doggraphql.repository;

import org.springframework.data.repository.CrudRepository;
import sajjad.doggraphql.Entities.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
