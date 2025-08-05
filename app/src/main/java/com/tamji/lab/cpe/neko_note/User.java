package com.tamji.lab.cpe.neko_note;

public class User {
    private String userName;
    private String password;

    public String getUserName(){
        return userName;
    }

    public String login(String user2Login, String Pass2Login){
        if(user2Login.toLowerCase() == "admin" & Pass2Login == "1234"){
            return "Login Successful";
        }
        return null;
    }

    void checkUserName(){}
}
