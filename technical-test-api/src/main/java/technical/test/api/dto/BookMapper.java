package technical.test.api.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import technical.test.api.storage.model.Book;

@Mapper
public interface BookMapper {
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	Book toEntity(BookDto bookDTO);
	BookDto toDto(Book book);
}