package com.test.medium.noticeboard.mapper;

import com.test.medium.noticeboard.controller.dto.BoardDTO;
import com.test.medium.noticeboard.entity.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    BoardDTO boardToDto(Board board);
    Board dtoToBoard(BoardDTO boardDTO);
}
