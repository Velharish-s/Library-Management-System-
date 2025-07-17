package com.example.Library.Management.System.service;

import com.example.Library.Management.System.repo.BookRepo;
import com.example.Library.Management.System.repo.TransactionRepo;
import com.example.Library.Management.System.source.Book;
import com.example.Library.Management.System.source.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionRepo transactionRepo;
    @Autowired
    BookRepo bookRepo;
    public void takeTake(Transaction transaction){
        transactionRepo.save(transaction);
    }
    public void returnBook(int id,Transaction transaction){
         transactionRepo.deleteById(id);
    }
    public List<Transaction> getAllProduct(){
        return transactionRepo.findAll();
    }
    public Object getMember(int id){
        return transactionRepo.findById(id);
    }
}
