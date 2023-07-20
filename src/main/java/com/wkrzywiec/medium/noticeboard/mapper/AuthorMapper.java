package com.test.medium.noticeboard.mapper;

import com.test.medium.noticeboard.controller.dto.AuthorDTO;
import com.test.medium.noticeboard.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDTO authorToDto(Author author);
    Author dtoToAuthor(AuthorDTO authorDTO);
}
