package guru.springframework.spring5webapp.reposetories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omer on 21/10/2020
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {


}
