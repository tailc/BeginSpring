package com.congtai.ch02.service;

import com.congtai.ch02.domain.Account;

/**
 * The interface Account service.
 */
public interface AccountService {

    Account getAccount(long l);

    /**
     * Transfer money.
     *
     * @param accountSource the account source
     * @param accountDest   the account dest
     * @param amount        the amount
     */
    public void transferMoney(long accountSource, long accountDest, double amount);
}
