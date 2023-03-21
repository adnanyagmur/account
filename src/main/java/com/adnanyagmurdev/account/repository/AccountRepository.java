package com.adnanyagmurdev.account.repository;


import com.adnanyagmurdev.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
