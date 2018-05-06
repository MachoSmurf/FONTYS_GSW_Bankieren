package com.github.machosmurf.gswbankieren.bank.rest;

import com.github.machosmurf.gswbankieren.bank.BankController;
import com.github.machosmurf.gswbankieren.shared.Transaction;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    private BankController bankController;

    public RestApi(BankController bankController) {
        this.bankController = bankController;
    }

    /**
     * REST ENDPOINTS BANK TO CENTRAL
     * ----------------------------------------------
     * | Endpoint           | Method                |
     * ----------------------------------------------
     * | /transaction       | POST                  |
     * ----------------------------------------------
     */

    @RequestMapping(name = "/transaction", method = RequestMethod.POST)
    public Transaction makeTransaction(@RequestBody Transaction transaction){
        return null;
    }
}
