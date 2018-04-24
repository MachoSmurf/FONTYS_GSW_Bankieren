package com.github.machosmurf.gswbankieren.shared;

public class TransactionNegativeException extends Exception {

    public TransactionNegativeException() {}

    public TransactionNegativeException(String message){
        super(message);
    }
}
