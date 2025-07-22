package com.tamji.lab.cpe.neko_note;

public class User {
    String userName;
    String passKey;

    void login(){
        if (userName == "NEKO" && passKey == "3516"){
            System.out.println("Welcome " + userName + "\n");
        }else {
            System.out.println("User Name not found or Incorrect Password\n");
        }
    }
}
