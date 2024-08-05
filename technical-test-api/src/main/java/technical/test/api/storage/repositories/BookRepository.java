package technical.test.api.storage.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import technical.test.api.storage.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}