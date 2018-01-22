package com.congtai.ch02.domain;

import java.util.Date;

public class Account {

    private Date accessDate;

    private double balance;

    private long id;

    private String name;

    public Account(Date accessDate, double balance, long id, String name) {
        this.accessDate = accessDate;
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class AccountBuilder {

        private Date accessDate;

        private double balance;

        private long id;

        private String name;

        private AccountBuilder() {
        }

        public static AccountBuilder anAccount() {
            return new AccountBuilder();
        }

        public Account build() {
            return new Account(accessDate, balance, id, name);
        }

        public AccountBuilder withAccessDate(Date accessDate) {
            this.accessDate = accessDate;
            return this;
        }

        public AccountBuilder withBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public AccountBuilder withName(String name) {
            this.name = name;
            return this;
        }
    }
}
