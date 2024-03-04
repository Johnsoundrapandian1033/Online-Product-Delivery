package com.ProductDelivary;
import java.util.*;
public class DelivaryBoy {
    DelivaryBoy(){}
    String name;
    long ph_No;
    String vehicle;
    DelivaryBoy(String name,long ph_No,String noboard){
        this.name = name;
        this.ph_No =ph_No;
        this.vehicle = noboard;
    }
    public long getMobileno(){
        return ph_No;
    }
    public String getDelivaryBoy(){
        return  "delivaryBoy Name :" +name +
        "\nmobile number : "+ph_No+
        "\nvehicle number"+ vehicle;
    }
    List<DelivaryBoy>deliboy = new ArrayList<>();
    public void delivaryBoyList(){
        deliboy.add(new DelivaryBoy("Hilton",8057236542l,"TN72AE8945"));
        deliboy.add(new DelivaryBoy("John",8057236542l,"TN34CD84935"));
        deliboy.add(new DelivaryBoy("Jeb",8057236542l,"TN02CW8945"));

    }
}
//class No_Board{
//    String state = "TN";
//    int rto_no ;
//    char serialname;
//    long serialno;
//    No_Board(String state,int rto_no,char serialname,long serialno){
//        this.state = state;
//        this.rto_no = rto_no;
//        this.serialname = serialname;
//        this.serialno = serialno;
//    }
//}
