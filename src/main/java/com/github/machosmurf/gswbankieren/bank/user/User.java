package com.github.machosmurf.gswbankieren.bank.user;

import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private String loginName;
    private String password;
    private String salt;

    public User(){} //JPA Empty Constructor

    public User(String name,
                String city,
                String loginName,
                String password){
        this.name = name;
        this.city = city;
        this.loginName = loginName;
        this.password = password;
        this.salt = BCrypt.gensalt(10);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getLoginName() {
        return loginName;
    }

    public boolean checkPassword(String password){
        if (BCrypt.hashpw(password, salt).equals(this.password)){
            return true;
        }
        return false;
    }

    private String hashPassword(String password, String salt){
        return BCrypt.hashpw(password, salt);
    }
}
