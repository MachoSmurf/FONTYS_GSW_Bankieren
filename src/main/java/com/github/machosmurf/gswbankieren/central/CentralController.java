package com.github.machosmurf.gswbankieren.central;

import java.util.Collection;

public class CentralController implements ICentralForBank {

    /**
     * Fetches all known banks and their status, including info nessecairy for other banks
     *
     * @param authenticationkey The key that identifies the connection between bank and central
     * @return Collections of Banks
     */
    @Override
    public Collection<BankEntity> getBanken(String authenticationkey) {
        return null;
    }

    /**
     * logs a bank into the system so it can do transfers
     *
     * @param bankId       id of the bank
     * @param bankPassword password of the bank
     * @return String Authentication Key to be used in transfers from central to bank
     */
    @Override
    public String login(String bankId, String bankPassword) {
        return null;
    }

    /**
     * logs a bank out so no transfers can be made any longer
     *
     * @param authenticationKey The key that identifies the connection between bank and central
     */
    @Override
    public void logout(String authenticationKey) {

    }

    /**
     * transfers money between to banks
     *
     * @param authenticationKey The key that identifies the connection between bank and central
     * @param accountFrom       The account where the money was transfered from
     * @param accountTo         The account the money needs to be transfered to
     * @param ammount           The ammount of money
     * @return boolean on succesfull receiving the money
     */
    @Override
    public boolean transfer(String authenticationKey, String accountFrom, String accountTo, double ammount) {
        return false;
    }
}
