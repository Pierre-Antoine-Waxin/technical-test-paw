package technical.test.api.dto;

import lombok.Data;
import technical.test.api.storage.model.Author;

@Data
public class BookDto {
	public String isbn;
	public String title;
	public Short publishingYear;
	public Author author;
}
