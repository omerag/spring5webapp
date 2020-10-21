package guru.springframework.spring5webapp.reposetories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omer on 21/10/2020
 */

public interface BookRepository extends CrudRepository<Book, Long> {


}
