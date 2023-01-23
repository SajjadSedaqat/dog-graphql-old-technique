package sajjad.doggraphql.repository;

import org.springframework.data.repository.CrudRepository;
import sajjad.doggraphql.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
