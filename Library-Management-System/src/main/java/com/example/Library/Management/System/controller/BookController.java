package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.service.BookService;
import com.example.Library.Management.System.source.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService serve;
    @GetMapping("/books")
    List<Book>  getAllBooks() {
           return serve.getAllBooks();
    }
    @GetMapping("/books/{id}")
    Object GetId(@PathVariable int id){
          return serve.getBookById(id);
    }
    @PostMapping("/books")
    void addBook(@RequestBody Book book){
        serve.addBook(book);
    }
    @PutMapping("/books/{id}")
    void updateBook(@PathVariable int id,@RequestBody Book book){
        serve.update(id,book);
    }
    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable int id){
        serve.deleteBookById(id);
    }
    @GetMapping("/books/search")
    List<Book> searchBookByTitle(@RequestParam String title){
         return serve.searchBook(title);
    }
}
