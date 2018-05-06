package com.github.machosmurf.gswbankieren.bank.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Component
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;

        //load testusers
        Set<User> userSet = new HashSet<>();
        userSet.add(new User("Henk", "Amsterdam", "HenkA", "password"));
        userSet.add(new User("Frits", "Amsterdam", "FritsA", "password"));
        userSet.add(new User("Truus", "Amsterdam", "TruusA", "password"));

        Iterator<User> userIterator = userSet.iterator();
        while(userIterator.hasNext()){
            userRepository.save(userIterator.next());
        }
    }

    public User addUser(){
        //TODO check if user allready exists, based on name/city combo And username
        return null;
    }
}
