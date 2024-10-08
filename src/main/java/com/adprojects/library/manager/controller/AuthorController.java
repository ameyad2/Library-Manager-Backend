package com.adprojects.library.manager.controller;

import com.adprojects.library.manager.model.Author;
import com.adprojects.library.manager.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/author/all")
    public List<Author> getAuthors(){
        return authorService.findAll();
    }
}
