package com.tamji.lab.cpe.neko_note;

public class User {
    private String userName;
    private int pin;

    public String getUserInformation(){
        return userName;
    }

    public void addUser(String newUser,int newPin){
        this.userName = newUser;
        this.pin = newPin;
    }
}
