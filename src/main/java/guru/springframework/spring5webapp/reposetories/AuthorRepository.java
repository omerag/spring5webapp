package guru.springframework.spring5webapp.reposetories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omer on 21-Oct-20.
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {




}
