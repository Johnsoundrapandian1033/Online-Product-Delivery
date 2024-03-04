package com.ProductDelivary;
class johnException extends Exception{
     johnException(String s){
        super(s);
    }
}
class HowToPay{
//             public String payments (PayMent payment,double pay,double price ) throws Exception
//             {
//                String bal = payment.payments(pay,price);
//                return bal;
//             }
             public String payments (PayMent payment,double price,double account) throws Exception {
                String balance = payment.payments(price,account);
                return balance;
             }
}
public class PayMent {
    String payments(double price, double account)throws Exception{
        return "";
    }
}
class cashOnDelivary extends PayMent{
    @Override
    String payments(double price,double pay) throws Exception{
           if (price == pay) {
                return "0";
            } else if (price < pay) {
                double balance= pay - price;
                return " "+balance;
            } else {
                throw new johnException("In-valid price amount.the product price rs."+price+" .So,your order is cancel ");
            }
    }
}
class UPI_Payment extends PayMent{
   // @Override
    String payments(double price, double account) throws Exception {
        if(price <= account  )
        {

            return "Payment successfully ";
        }
        else{
            throw new johnException("in-sufficiant account balance.The product price rs."+price+" .so,payment is unsuccessfully .... ");

        }
    }
}
class DepitCard_payment extends PayMent{
     @Override
     String payments(double price,double account) throws Exception {
        if(price <= account  )
        {
           return "payment successfully ";
        }
        else{
            throw new johnException("in-sufficiant account balance.The product price rs."+price+" .so,payment is un-successfullly....  ");
        }
    }
}
