package com.github.machosmurf.gswbankieren.central.rest;

import com.github.machosmurf.gswbankieren.central.CentralController;
import com.github.machosmurf.gswbankieren.shared.LoginState;
import com.github.machosmurf.gswbankieren.shared.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

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

    @RequestMapping(name = "/transaction", method = RequestMethod.POST)
    public Transaction makeTransaction(@RequestBody Transaction transaction){
        return null;
    }

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public LoginState bankLogin(@RequestBody LoginState state){
        return null;
    }

    @RequestMapping(name = "/logout", method = RequestMethod.GET)
    public LoginState bankLogout(@RequestBody LoginState state){
        return null;
    }
}
