package com.github.machosmurf.gswbankieren.central;

import java.util.Collection;

/**
 * Inderectly specifies the endpoints to be accesable for a bank.
 */
public interface ICentralForBank {
    /**
     * Fetches all known banks and their status, including info nessecairy for other banks
     * @return Collections of Banks
     */
    public Collection<CentralController> getBanken();

    /**
     * logs a bank into the system so it can do transfers
     * @param bankId id of the bank
     * @param bankPassword password of the bank
     * @return String Authentication Key to be used in transfers from central to bank
     */
    public String login(String bankId, String bankPassword);

    /**
     * logs a bank out so no transfers can be made any longer
     */
    public void logout();

    /**
     * transfers money between to banks
     * @param accountFrom The account where the money was transfered from
     * @param accountTo The account the money needs to be transfered to
     * @param ammount The ammount of money
     * @return boolean on succesfull receiving the money
     */
    public boolean transfer(String accountFrom, String accountTo, double ammount);
}
