package technical.test.api.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technical.test.api.storage.model.Author;
import technical.test.api.storage.model.Book;
import technical.test.api.storage.repositories.AuthorRepository;
import technical.test.api.storage.repositories.BookRepository;

import java.util.List;

@Data
@Service
public class LibraryService {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;

	@Autowired
	public LibraryService(final BookRepository bookRepository, final AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	public Book registerBook(final Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Author registerAuthor(final Author author) {
		return authorRepository.save(author);
	}
}
