package com.github.machosmurf.gswbankieren.bank;

import javax.transaction.Transaction;
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
     * @param accountFrom String accountFrom
     * @param accountTo String accountTo
     * @param ammount double ammount of money
     * @return boolean of propper receive
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
