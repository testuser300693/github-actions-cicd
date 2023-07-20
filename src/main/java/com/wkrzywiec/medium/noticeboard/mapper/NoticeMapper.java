package com.test.medium.noticeboard.mapper;

import com.test.medium.noticeboard.controller.dto.NoticeDTO;
import com.test.medium.noticeboard.entity.Notice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NoticeMapper {

    NoticeMapper INSTANCE = Mappers.getMapper(NoticeMapper.class);

    NoticeDTO noticeToDto(Notice notice);
    Notice dtoToNotice(NoticeDTO noticeDTO);
}
