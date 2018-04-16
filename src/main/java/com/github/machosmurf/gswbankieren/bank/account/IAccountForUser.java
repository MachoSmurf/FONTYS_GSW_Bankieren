package com.github.machosmurf.gswbankieren.bank.account;

import java.util.Collection;

/**
 * Exposes account search to the user
 */
public interface IAccountForUser {
    Collection<Account> findAccountsByUser();
}
