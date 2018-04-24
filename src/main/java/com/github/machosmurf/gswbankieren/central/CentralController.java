package com.github.machosmurf.gswbankieren.central;

import java.util.Collection;

public class CentralController implements ICentralForBank {
    @Override
    public Collection<CentralController> getBanken() {
        return null;
    }

    @Override
    public String login(String bankId, String bankPassword) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean transfer(String accountFrom, String accountTo, double ammount) {
        return false;
    }
}
