package com.github.machosmurf.gswbankieren.bank.user;

import com.github.machosmurf.gswbankieren.bank.account.Account;

import java.util.Collection;

/**
 * Describes the behaviour of a user within the bank
 */
public interface IBankUser {

    /**
     * Logs a user in to the system
     * @param username String containting username
     * @param password String containing password
     * @return boolean result
     */
    boolean login(String username, String password);

    /**
     * Logs a user out of the system
     */
    void logout();

    /**
     * Gets all the financial accounts linked to this user
     * @return Collection of accounts
     */
    Collection<Account> getAccounts();

    /**
     * Adds a financial account to this user
     * @return Account that was created
     */
    Account addAccount();
}
