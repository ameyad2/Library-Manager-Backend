package com.adprojects.library.manager.controller;

import com.adprojects.library.manager.dto.BookResponse;
import com.adprojects.library.manager.dto.CreateBookRequest;
import com.adprojects.library.manager.dto.SearchBookRequest;
import com.adprojects.library.manager.model.Book;
import com.adprojects.library.manager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("")
    public Book createBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        return bookService.create(createBookRequest);
    }

    @DeleteMapping("/{bookId}")
    public BookResponse deleteBook(@PathVariable("bookId") int bookId){
        try {
            return BookResponse.from(bookService.delete(bookId));
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.get();
    }

    // pages < 500
    // author_name , Peter =
    // name  'Programming101' =

    @GetMapping("/search")
    public List<Book> getBooksByAuthor(@RequestBody @Valid SearchBookRequest searchBookRequest) throws Exception {
        return bookService.search(searchBookRequest);
    }




}
