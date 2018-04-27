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

    @Override
    public boolean transfer(String authenticationKey, String accountFrom, String accountTo, double ammount) {
        return false;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

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

    @Override
    public Collection<Account> getAccounts() {
        return null;
    }
}
