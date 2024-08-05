package technical.test.api.storage.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Author {

	@Id
	public String id;
	public String firstName;
	public String lastName;
}
