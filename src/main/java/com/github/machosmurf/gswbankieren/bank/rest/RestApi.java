package com.github.machosmurf.gswbankieren.bank.rest;

import com.github.machosmurf.gswbankieren.bank.BankController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    private BankController bankController;

    public RestApi(BankController bankController) {
        this.bankController = bankController;
    }
}
