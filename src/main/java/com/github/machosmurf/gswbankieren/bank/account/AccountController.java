package com.github.machosmurf.gswbankieren.bank.account;

import javax.transaction.Transaction;
import java.util.Collection;
import java.util.Date;

public class AccountController implements IBankAccount {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public boolean transfer(String accountFrom, String accountTo, double ammount) {
        return false;
    }

    @Override
    public Collection<Transaction> findTransactions(Date from, Date to) {
        return null;
    }

    @Override
    public Collection<Transaction> findTransactions(String accountTo, String accountsFrom) {
        return null;
    }

    @Override
    public Collection<Transaction> findTransactions(String accountTo, String accountsFrom, Date from, Date to) {
        return null;
    }
}
