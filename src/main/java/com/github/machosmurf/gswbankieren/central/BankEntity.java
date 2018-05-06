package com.github.machosmurf.gswbankieren.central;

import javax.persistence.Entity;

@Entity
public class BankEntity {
    private String ip;
    private String authenticationkey;
    private boolean online;
    private String bankUsername;
    private String bankName;

    public BankEntity(){

    }

}
