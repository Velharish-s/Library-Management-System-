package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.service.TransactionService;
import com.example.Library.Management.System.source.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @Autowired
    TransactionService service;
    @PostMapping("transactions/issue")
    void takeBook(@RequestBody Transaction transaction){
         service.takeTake(transaction);
    }
    @PostMapping("/transactions/return/{id}")
    void ReturnBook(@RequestBody Transaction transaction){
        service.returnBook(transaction);
    }
    @GetMapping("/transactions")
    List<Transaction> getAllTransaction(){
        return service.getAllProduct();
    }
    @GetMapping("/transactions/member/{Id}")
    Object getMember(@PathVariable int id){
        return service.getMember(id);
    }
}
