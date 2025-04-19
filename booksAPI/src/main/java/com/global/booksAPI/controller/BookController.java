package com.global.booksAPI.controller;

import com.global.booksAPI.Service.BookService;
import com.global.booksAPI.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping()
    public Book createBook(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping()
    public Iterable<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Integer id, @RequestBody Book book){
        return bookService.update(id,book);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        bookService.deleteById(id);
    }
}
