package com.ProductDelivary;

import java.util.ArrayList;
import java.util.List;

class Address {
    Address(){}
    private String door_No;
    private String street;
    private String town_name;
    private String district;
    private String state;
    private long pin_code;

    Address(String no, String st, String vill, String dist, String stat, long pin) {
        door_No = no;
        street = st;
        town_name = vill;
        district = dist;
        state = stat;
        pin_code = pin;
    }

    void setDoorNo(String no) {
        door_No = no;
    }

    void setStreet(String st) {
        street = st;
    }

    void setTownName(String vill) {
        town_name = vill;
    }

    void setDistrict(String dist) {
        district = dist;
    }

    void setState(String stat) {
        state = stat;
    }

    void setPinCode(long pin) {
        pin_code = pin;
    }

    String getDoorNo() {
        return door_No;
    }

    String getStreet() {
        return street;
    }

    String getTownName() {
        return town_name;
    }

    String getDistrict() {
        return district;
    }

    String getState() {
        return state;
    }

    long getPinCode() {
        return pin_code;
    }
    public String getAddresses()
    {
        return "Door_No  :" + door_No +
                "\nStreet :" + street +
                "\nTown_name :" + town_name +
                "\ndistrict :" + district +
                "\nstate :" + state +
                "\npin_code :" + pin_code;
    }

}
