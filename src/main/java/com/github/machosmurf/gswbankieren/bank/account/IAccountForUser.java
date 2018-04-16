package com.github.machosmurf.gswbankieren.bank.account;

import com.github.machosmurf.gswbankieren.bank.Account;

import java.util.Collection;

/**
 * Exposes account search to the user
 */
public interface IAccountForUser {
    Collection<Account> findAccountsByUser();
}
