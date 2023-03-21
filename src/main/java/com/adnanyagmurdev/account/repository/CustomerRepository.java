package com.adnanyagmurdev.account.repository;

import com.adnanyagmurdev.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
