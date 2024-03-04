package com.ProductDelivary;
import java.util.*;
public class Products {


    List<Things>product = new ArrayList<>();
    Set<Things>setproduct = new HashSet<>();
//    public void ThingsList(){
//        for(int i = 0;i<product.size();i++) {
//            if (!product.get(i).getThingName().equals(product.get(i).getThingName())) {
//                setproduct.add(product.get(i));
//            }
//        }
//        System.out.println(setproduct);
//    }
    public void productList() {
        product.add(new Things("head phone","boat",827));
        product.add(new Things("head phone","jbl",412));
        product.add(new Things("head phone","sony",1254));
        product.add(new Things("ear phone","jbl",387));
        product.add(new Things("ear phone","boat",659));
        product.add(new Things("ear phone","sony",1043));
        product.add(new Things("mixy","sony",3018));
        product.add(new Things("mixy","sony",2856));
        product.add(new Things("mixy","butterfly",2789));
        product.add(new Things("mixy","preethi",2574));
        product.add(new Things("mobile","apple",61999));
        product.add(new Things("mobile","vivo",19999));
        product.add(new Things("mobile","nokia",12999));
        product.add(new Things("shirt","allensolly ",1112));
        product.add(new Things("shirt","romco",765));
        product.add(new Things("shirt","otto",832));
        product.add(new Things("bat","ceat",1569));
        product.add(new Things("bat","newbalance",890));
        product.add(new Things("bat","mrf",730));
        product.add(new Things("foot ball","cosco",800));
        product.add(new Things("foot ball","soccorpro",1380));
        product.add(new Things("foot wear","vkc",328));
        product.add(new Things("foot wear","walkaroo",390));
        product.add(new Things("zoe","adidas",2050));
        product.add(new Things("zoe","nike",1740));
        product.add(new Things("zoe","puma",1320));
        product.add(new Things("t-Shirt","puma",370));
        product.add(new Things("t-Shirt","adidas",310));
        product.add(new Things("t-Shirt","nike",270));
        product.add(new Things("aircoolar","sony",2300));
        product.add(new Things("aircoolar","preethi",2100));
        product.add(new Things("laptop","hp",70000));
        product.add(new Things("laptop","asus",45000));
        product.add(new Things("laptop","apple",90000));
        product.add(new Things("bag","Roshan",1170));
        product.add(new Things("bag","puma",940));
        product.add(new Things("bag","adidas",680));

    }
}

