package com.github.machosmurf.gswbankieren.bank.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser(){
        //TODO check if user allready exists, based on name/city combo And username
        return null;
    }
}
