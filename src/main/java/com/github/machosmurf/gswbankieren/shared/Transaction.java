package com.github.machosmurf.gswbankieren.shared;

import com.github.machosmurf.gswbankieren.bank.account.Account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private int transactionId;
    private double amount;
    private Account accountFrom;
    private Account accountTo;
    private Date date;
    private String description;

    //JPA Constructor
    public Transaction() {}

    public Transaction(double amount,
                       Account accountFrom,
                       Account accountTo,
                       Date date,
                       String description) throws TransactionNegativeException {
        if (amount <= 0){
            throw new TransactionNegativeException();
        }
        this.amount = amount;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.date = date;
        this.description = description;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}
