package technical.test.api.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import technical.test.api.storage.model.Author;

@Mapper
public interface AuthorMapper {
	AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

	Author toEntity(AuthorDto authorDto);
	AuthorDto toDto(Author author);
}