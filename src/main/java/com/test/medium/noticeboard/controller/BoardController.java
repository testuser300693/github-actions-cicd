package com.test.medium.noticeboard.controller;

import com.test.medium.noticeboard.controller.dto.BoardDTO;
import com.test.medium.noticeboard.service.BoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController extends CrudController<BoardDTO> {

    public BoardController(BoardService boardService) {
        super(boardService);
    }
}
