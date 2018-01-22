package com.congtai.ch02.service.impl;

import com.congtai.ch02.dao.AccountDao;
import com.congtai.ch02.domain.Account;
import com.congtai.ch02.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account getAccount(long accountId) {
        return accountDao.find(accountId);
    }

    @Override
    public void transferMoney(long accountSource, long accountDest, double amount) {
        Account account1 = accountDao.find(accountSource);
        Account account2 = accountDao.find(accountDest);

        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
}
