package com.test.medium.noticeboard.controller;

import com.test.medium.noticeboard.controller.dto.AuthorDTO;
import com.test.medium.noticeboard.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController extends CrudController<AuthorDTO> {

    public AuthorController(AuthorService authorService) {
        super(authorService);
    }
}
