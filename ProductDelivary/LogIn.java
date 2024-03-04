package com.ProductDelivary;
import java.util.*;
public class LogIn {

    private String userId;
    private String password;

    LogIn (String userid,String pawd){
        userId = userid ;
        password =pawd;
    }
    public void setUserID(String id){
        userId = id;
    }
    public void setPassword(String pawd){
        password = pawd;
    }
    //SignUp sign = new SignUp();
    public String getUserId(){
        return userId;
    }
    public String getPassword(){
        return password;
    }
    public String getLogIn(){
        return "User Id :"+userId + "Password : "+password;
    }

}
