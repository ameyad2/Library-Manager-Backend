package com.adprojects.library.manager.repository;

import com.adprojects.library.manager.model.Book;
import com.adprojects.library.manager.model.Student;
import com.adprojects.library.manager.model.Transaction;
import com.adprojects.library.manager.model.enums.TransactionStatus;
import com.adprojects.library.manager.model.enums.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


    Transaction findTopByStudentAndBookAndTransactionTypeAndTransactionStatusOrderByTransactionTimeDesc(
            Student student, Book book, TransactionType transactionType, TransactionStatus transactionStatus
    );
}
