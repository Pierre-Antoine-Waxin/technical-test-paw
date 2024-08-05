package technical.test.api.storage.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Book {

	@Id
	public String isbn;
	public String title;
	public Short publishingYear;
	public Author author;
}
