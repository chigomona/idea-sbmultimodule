package com.eshop.sales.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eshop.sales.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByNumber(String number);
}
