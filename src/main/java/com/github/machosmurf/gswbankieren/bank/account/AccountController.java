package com.github.machosmurf.gswbankieren.bank.account;

import javax.transaction.Transaction;
import java.util.Collection;
import java.util.Date;

public class AccountController implements IBankAccount {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    /**
     * Gets the saldo for this users session
     *
     * @return double saldo for this user
     */
    @Override
    public double getSaldo() {
        return 0;
    }

    /**
     * transfers money from one account to another
     *
     * @param transaction Transaction object that needs to be transfered
     * @return boolean whether successful
     */
    @Override
    public boolean transfer(Transaction transaction) {
        return false;
    }

    /**
     * Finds transactions matching a bracket of dates
     *
     * @param from Date from
     * @param to   Date to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(Date from, Date to) {
        return null;
    }

    /**
     * Finds transactions matching params
     *
     * @param accountTo    Account from
     * @param accountsFrom Account to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(String accountTo, String accountsFrom) {
        return null;
    }

    /**
     * Finds transactions matching accounts and date brackets
     *
     * @param accountTo    String account to
     * @param accountsFrom String account from
     * @param from         Date from
     * @param to           Date to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(String accountTo, String accountsFrom, Date from, Date to) {
        return null;
    }
}
