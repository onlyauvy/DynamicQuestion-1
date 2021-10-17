package com.bhbfc.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhbfc.question.model.Transaction;

public interface TransactionsRepository extends JpaRepository<Transaction, Long>{

}
