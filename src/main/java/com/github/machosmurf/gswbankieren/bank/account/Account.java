package com.github.machosmurf.gswbankieren.bank.account;

import com.github.machosmurf.gswbankieren.bank.user.User;
import com.github.machosmurf.gswbankieren.shared.Transaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private String accountNumber;
    /*@ManyToOne
    private User accountOwner;*/
    private double credit;
    @OneToMany(mappedBy = "accountFrom", targetEntity = Transaction.class)
    private Set<Transaction> transactions;

    public Account() {
    } //JPA Constructor

    public Account(String bankID, User accountOwner) {
        credit = 100;
        //this.accountOwner = accountOwner;
        this.accountNumber = generateAccountNumber(bankID);
        transactions = new HashSet<>();
    }

    private String generateAccountNumber(String bankID) {
        String randCharCollecion = "1234567890abcdefghijklmnopqrstuvwxyz";

        String accountNr = bankID;
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            accountNr = accountNr + randCharCollecion.charAt(r.nextInt(randCharCollecion.length()-1));
        }

        return accountNr;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
