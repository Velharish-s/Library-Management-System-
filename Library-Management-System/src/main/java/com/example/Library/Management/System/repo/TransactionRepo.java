package com.example.Library.Management.System.repo;

import com.example.Library.Management.System.source.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Integer> {
}
