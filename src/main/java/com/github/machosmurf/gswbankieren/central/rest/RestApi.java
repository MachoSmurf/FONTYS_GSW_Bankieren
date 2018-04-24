package com.github.machosmurf.gswbankieren.central.rest;

import com.github.machosmurf.gswbankieren.central.CentralController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    private CentralController centralController;

    @Autowired
    public RestApi(CentralController centralController){
        this.centralController = centralController;
    }

    /**
     * REST ENDPOINTS BANK TO CENTRAL
     * ----------------------------------------------
     * | Endpoint           | Method                |
     * ----------------------------------------------
     * | /transaction       | POST                  |
     * | /login             | GET                   |
     * | /logout            | GET                   |
     * ----------------------------------------------
     */
}
