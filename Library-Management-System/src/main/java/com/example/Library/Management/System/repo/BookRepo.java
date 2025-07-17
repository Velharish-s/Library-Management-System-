package com.example.Library.Management.System.repo;

import com.example.Library.Management.System.source.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    @Query("SELECT p from Book as p where LOWER(title) like LOWER(CONCAT('%',:title,'%'))")
    List<Book> searchTitle(String title);
}
