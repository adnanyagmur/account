package com.adnanyagmurdev.account.repository;

import com.adnanyagmurdev.account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
