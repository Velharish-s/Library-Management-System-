package com.example.Library.Management.System.source;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Date;
@Component
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //bookId
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "mem_id")
    private Member member;
    private Date issueDate;
    private Date returnDate;
    private boolean returned=false;
    public Transaction(){}
    public Transaction(Long id, Book book, Member member, Date issueDate, Date returnDate, boolean returned) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnData() {
        return returnDate;
    }

    public void setReturnData(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
