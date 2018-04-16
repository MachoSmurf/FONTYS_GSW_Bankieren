package com.github.machosmurf.gswbankieren.bank;

/**
 * Specifies endpoints to expose to central via central
 */
public interface IBankForCentral {
    /**
     * gets a transaction from central to this bank
     * @param authKey String that identifies the central
     * @param accountFrom String account from
     * @param accountTo String account to
     * @param ammount double ammount
     * @return boolean on propper recieve of transaction
     */
    boolean transfer(String authKey, String accountFrom, String accountTo, double ammount);
}
