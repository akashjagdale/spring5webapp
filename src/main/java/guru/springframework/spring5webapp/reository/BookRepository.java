package guru.springframework.spring5webapp.reository;

import guru.springframework.spring5webapp.domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Long> {
}
