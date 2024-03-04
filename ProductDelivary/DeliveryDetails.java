package com.ProductDelivary;
import java.util.*;
import java.time.LocalDate;
public class DeliveryDetails {
    String details;
    DeliveryDetails(String det){
        details =det;
    }
    DeliveryDetails(){}
    List<String>deli = new ArrayList<>();
    void delivaryDetails() {
        deli.add("\norder confirmed ...\n"+LocalDate.now());
        deli.add("Shipped ....\n"+LocalDate.now().plusDays(1));
        deli.add("out for delivary ... \n"+LocalDate.now().plusDays(3));
        deli.add("Delivered...  \n"+LocalDate.now().plusDays(4));
    }
}
