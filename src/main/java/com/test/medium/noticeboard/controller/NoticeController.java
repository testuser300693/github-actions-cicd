package com.test.medium.noticeboard.controller;

import com.test.medium.noticeboard.controller.dto.NoticeDTO;
import com.test.medium.noticeboard.service.NoticeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticeController extends CrudController<NoticeDTO> {

    public NoticeController(NoticeService noticeService) {
        super(noticeService);
    }
}
