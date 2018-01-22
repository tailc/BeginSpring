package com.congtai.ch02.dao;

import com.congtai.ch02.domain.Account;

/**
 * The interface Account dao.
 */
public interface AccountDao {

    /**
     * Find account.
     *
     * @param accountId the account id
     * @return the account
     */
    public Account find(long accountId);
}
