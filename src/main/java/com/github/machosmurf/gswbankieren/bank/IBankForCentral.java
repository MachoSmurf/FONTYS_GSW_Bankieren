package com.github.machosmurf.gswbankieren.bank;

/**
 * Specifies endpoints to expose to central via central
 */
public interface IBankForCentral {

    //TODO: onderstaande vervangen door transactie object
    /**
     * gets a transaction from central to this bank
     * @param authenticationKey String that identifies the central
     * @param accountFrom String account from
     * @param accountTo String account to
     * @param ammount double ammount
     * @return boolean on propper recieve of transaction
     */
    boolean transfer(String authenticationKey, String accountFrom, String accountTo, double ammount);
}
