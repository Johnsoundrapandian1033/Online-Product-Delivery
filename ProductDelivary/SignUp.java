package com.ProductDelivary;
import java.util.*;
enum Gender{
    MALE,FEMALE,TRANSGENDER;
}

public class SignUp {
    SignUp(){}
    private String userName;
    private String userId;
    private String passWord;
    private long mobile_No;
    Gender gender;
    ArrayList<Address> address;
    SignUp(String name,String id,String password,long mo_no,Gender gen,ArrayList<Address> add){
        userName =name;
        userId = id;
        passWord = password;
        mobile_No =mo_no;
        gender =gen;
        address = add;
    }

    public void setUserName(String name){
        userName = name;
    }
    public void setUserId(String id){
        userId = id;
    }
    public void setPassWord (String password){
        passWord = password;
    }
    public void setMobileNo(Long mob_NO){
        mobile_No = mob_NO;
    }
    public void setGender(Gender gen){
        gender = gen;
    }
    public void setAddress(ArrayList<Address> add){
        address =add;
    }
    public String getUserName(){
        return userName ;
    }
    public String getUserId(){
        return userId;
    }
    public String getPassWord(){
       return  passWord ;
    }
    public long getMobileNo(){
        return mobile_No ;
    }
    public Gender getGender(){
        return gender ;
    }
    public ArrayList<Address> getAddress() {
        return address;
    }
    User a = new User();
   public String getSignUp(){
        return  "name :"+ userName + "\nid :"+userId + "\npassword :"+ passWord + "\nmobile_no :" +mobile_No + "\ngender :"+gender +
                "\naddress ...." + address.get(0).getAddresses();
   }
}

