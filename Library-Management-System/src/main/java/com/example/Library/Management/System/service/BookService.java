package com.example.Library.Management.System.service;

import com.example.Library.Management.System.repo.BookRepo;
import com.example.Library.Management.System.source.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }
    public Object getBookById(int id){
         return bookRepo.findById(id);
    }
    public void addBook(Book book){
        bookRepo.save(book);
    }
    public void deleteBookById(int id){
        bookRepo.deleteById(id);
    }
    public List<Book> searchBook(String title){
            return bookRepo.searchTitle(title);
    }
    public void update(int id,Book book){
        bookRepo.save(book);
    }
}
