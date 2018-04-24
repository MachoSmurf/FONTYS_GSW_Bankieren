package com.github.machosmurf.gswbankieren.bank;

import com.github.machosmurf.gswbankieren.bank.account.Account;
import com.github.machosmurf.gswbankieren.shared.Transaction;

import java.util.Collection;
import java.util.Date;

/**
 * Specifies endpoints to expose to client via WebSockets
 */
public interface IBankForClient {
    /**
     * Logs a user in
     * @param username username
     * @param password password
     * @return boolean
     */
    boolean login(String username, String password);

    /**
     * logs a user out
     */
    void logout();

    /**
     * transfers money from one account to another
     * @param transaction transaction that needs to be send
     * @return boolean of propper receive
     */
    boolean transfer(Transaction transaction);

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

    /**
     * Gets the accounts associated by the user of this session
     * @return returns a collection of accounts
     */
    Collection<Account> getAccounts();
}
