package com.github.machosmurf.gswbankieren.bank.account;

import javax.transaction.Transaction;
import java.util.Collection;
import java.util.Date;

/**
 * Exposes account information and methods to the main controller
 */
public interface IBankRekening {
    /**
     * Gets the saldo for this users session
     * @return double saldo for this user
     */
    double getSaldo();

    /**
     * transfers money from one account to another
     * @param accountFrom String the account from
     * @param accountTo String the account to
     * @param ammount double ammount
     * @return boolean whether successful
     */
    boolean transfer(String accountFrom, String accountTo, double ammount);

    /**
     * Finds transactions matching a bracket of dates
     * @param from Date from
     * @param to Date to
     * @return Collection of transactions
     */
    Collection<Transaction> findTransactions(Date from, Date to);

    /**
     * Finds transactions matching params
     * @param accountTo Account from
     * @param accountsFrom Account to
     * @return Collection of transactions
     */
    Collection<Transaction> findTransactions(String accountTo, String accountsFrom);

    /**
     * Finds transactions matching accounts and date brackets
     * @param accountTo String account to
     * @param accountsFrom String account from
     * @param from Date from
     * @param to Date to
     * @return Collection of transactions
     */
    Collection<Transaction> findTransactions(String accountTo, String accountsFrom, Date from, Date to);
}
