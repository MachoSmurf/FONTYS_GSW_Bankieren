package com.github.machosmurf.gswbankieren.shared;

import com.github.machosmurf.gswbankieren.bank.account.Account;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transction")
public class Transaction {

    @Id
    @GeneratedValue
    private int id;
    private double amount;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accountFrom;
    /*@ManyToOne
    @JoinColumn(name = "user_id")*/
    //private Account accountTo;
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
        //this.accountTo = accountTo;
        this.date = date;
        this.description = description;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public Account getAccountTo() {
        //return accountTo;
        return null;
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
