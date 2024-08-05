package technical.test.api.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technical.test.api.dto.AuthorDto;
import technical.test.api.dto.AuthorMapper;
import technical.test.api.dto.BookDto;
import technical.test.api.dto.BookMapper;
import technical.test.api.services.LibraryService;
import technical.test.api.storage.model.Book;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/library")
public class LibraryController {

	private final LibraryService libraryService;

	@Autowired
	public LibraryController(final LibraryService libraryService) {
		this.libraryService = libraryService;
	}

	@PostMapping("/books")
	public BookDto registerBook(@RequestBody final BookDto bookDTO) {
		final var book = BookMapper.INSTANCE.toEntity(bookDTO);
		final var savedBook = libraryService.registerBook(book);
		return BookMapper.INSTANCE.toDto(savedBook);
	}

	@GetMapping("/books")
	public List<BookDto> getAllBooks() {
		List<Book> books = libraryService.getAllBooks();
		return books.stream()
				.map(BookMapper.INSTANCE::toDto)
				.collect(Collectors.toList());
	}

	@PostMapping("/authors")
	public AuthorDto registerAuthor(@RequestBody final AuthorDto authorDto) {
		final var author = AuthorMapper.INSTANCE.toEntity(authorDto);
		final var savedAuthor = libraryService.registerAuthor(author);
		return AuthorMapper.INSTANCE.toDto(savedAuthor);
	}
}
