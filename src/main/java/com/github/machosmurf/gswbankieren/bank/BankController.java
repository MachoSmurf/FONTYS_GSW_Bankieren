package com.github.machosmurf.gswbankieren.bank;

import com.github.machosmurf.gswbankieren.bank.account.Account;
import com.github.machosmurf.gswbankieren.bank.user.UserController;
import com.github.machosmurf.gswbankieren.shared.Transaction;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Date;

@Component
public class BankController implements IBankForCentral, IBankForClient {

    private UserController userController;

    public BankController(UserController userController) {
        this.userController = userController;
    }

    /**
     * gets a transaction from central to this bank
     *
     * @param authenticationKey String that identifies the central
     * @param accountFrom       String account from
     * @param accountTo         String account to
     * @param ammount           double ammount
     * @return boolean on propper recieve of transaction
     */
    @Override
    public boolean transfer(String authenticationKey, String accountFrom, String accountTo, double ammount) {
        return false;
    }

    /**
     * Logs a user in
     *
     * @param username username
     * @param password password
     * @return boolean
     */
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    /**
     * logs a user out
     */
    @Override
    public void logout() {

    }

    /**
     * transfers money from one account to another
     *
     * @param transaction transaction that needs to be send
     * @return boolean of propper receive
     */
    @Override
    public boolean transfer(Transaction transaction) {
        return false;
    }

    /**
     * Finds transactions matching a bracket of dates
     *
     * @param account The account to search transactions for
     * @param from    Date from
     * @param to      Date to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(Account account, Date from, Date to) {
        return null;
    }

    /**
     * Finds transactions matching params
     *
     * @param account      The account to search transactions for
     * @param accountTo    Account from
     * @param accountsFrom Account to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(Account account, String accountTo, String accountsFrom) {
        return null;
    }

    /**
     * Finds transactions matching accounts and date brackets
     *
     * @param account      The account to search transactions for
     * @param accountTo    String account to
     * @param accountsFrom String account from
     * @param from         Date from
     * @param to           Date to
     * @return Collection of transactions
     */
    @Override
    public Collection<Transaction> findTransactions(Account account, String accountTo, String accountsFrom, Date from, Date to) {
        return null;
    }

    /**
     * Gets the accounts associated by the user of this session
     *
     * @return returns a collection of accounts
     */
    @Override
    public Collection<Account> getAccounts() {
        return null;
    }
}
