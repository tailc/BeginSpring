package com.congtai.ch02.dao;

import com.congtai.ch02.domain.Account;
import com.congtai.ch02.domain.Account1;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountDaoImpl implements AccountDao {

    private Map<Long, Account> accountsMap = new HashMap<>();

    {
        Account acc1 = Account.AccountBuilder.anAccount().withId(1)
                .withName("a")
                .withBalance(100)
                .build();

        Account acc2 = Account.AccountBuilder.anAccount().withId(2L)
                .withName("b")
                .withBalance(200)
                .build();


        accountsMap.put(1l, acc1);
        accountsMap.put(2l, acc2);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }
}
