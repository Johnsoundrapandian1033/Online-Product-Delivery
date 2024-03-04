package com.ProductDelivary;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;
public class OnlineShop {
    static Scanner scanner = new Scanner(System.in);
    List<Things> th = new ArrayList<>();
    Set<String>get;
    List<Things> lowToHigh;
    List<Double> sprit;
    List<String>br;
    double price = 0;
    Products pt = new Products();
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        do {
            flag = false;
            System.out.println("Install App ......");
            System.out.println("1) FLIPKART ");
            System.out.println("2) AMAZON  ");
            System.out.println("3) MEESO  ");
            System.out.println("4) Exit... ");
            System.out.print("chooce your option  :");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(Apps.FLIPKART+" App  Install complete ...");
                    signup();
                    break;
                case 2:
                    System.out.println(Apps.AMAZON+" App  Install complete ...");
                    signup();
                    break;
                case 3:
                    System.out.println(Apps.MEESO+" App  Install complete ...");
                    signup();
                    break;
                case 4:
                    System.out.println("Exit .....");
                    break;
                default:
                    flag = true;
                    System.out.println("invalid option ");
                    break;
            }

        } while (flag);

    }
    static OnlineShop or = new OnlineShop();
    static User u = new User();
    static void signup()throws Exception {
        System.out.println("Sign Up .....");
        u.user();
        System.out.println(u.signups.get(0).getSignUp());
        login();
    }
      static void login()throws Exception{
        boolean fla = true;
        int count =0 ;
        do {
            System.out.println("Log In .....");
            fla = false;
            u.logIn();
            count++;
            if(u.log.size()== 0){
                fla = true;
                if(count == 3){
                    u.forgotPassword();
                    System.out.println("successfully change password ..... ");
                    login();
                    break;
                }
            }
            else {
                if (u.log.get(0).getUserId().equals(u.signups.get(0).getUserId()) && u.log.get(0).getPassword().equals(u.signups.get(0).getPassWord())) {
                    System.out.println("successfully login ....");
                    or.select();
                    break;
                }
                else {
                    fla = true;
                }
            }
        }while(fla);
    }
    public void select() throws Exception {
        pt.productList();
        this.get = new HashSet<>();
        System.out.println("Available products ....");
        for (Things i : pt.product) {
            get.add(i.getThingName());
        }
        System.out.println(get);
        boolean flag = true;
        do {
            flag = false;
            System.out.println("Search ...... ");
            System.out.println("1) Search product Name ");
            System.out.println("2) Exit the App ...... ");
            System.out.print("chooce your option 1 or 2 : ");
            int chooce = scanner.nextInt();
            switch (chooce) {
                case 1:
                    this.th = new ArrayList<>();
                    String empty = scanner.nextLine();
                    System.out.print("Enter the  thing name :");
                    String thingName = scanner.nextLine();
                    for (int i = 0; i < pt.product.size(); i++) {
                        if (pt.product.get(i).getThingName().equals(thingName)) {
                            th.add(pt.product.get(i));
                        }
                    }
                    for (Things i : th) {
                        System.out.println(i.getProduct());
                    }
                    filterSearch();
                    break;
                case 2:
                    System.out.println("------------- Thank You ---------------");
                    break;
                default:
                    flag = true;
                    System.out.println("In-valid option ........");
            }
        } while (flag);
    }
    public void filterSearch() throws Exception {
        boolean flag = true;
        do {
            flag = false;
            System.out.println("1) Sort By ");
            System.out.println("2) Search brand  ");
            System.out.println("3) Price Filter  ");
            System.out.print(" Enter your option   :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1) low to high ");
                        System.out.println("2) high to low  ");
                        System.out.println("3) back  ");
                        System.out.print("Select your option :");
                        int select = scanner.nextInt();
                        switch (select) {
                            case 1:
                                this.sprit = new ArrayList<>();
                                //sprit.clear();
                                this.lowToHigh = new ArrayList<>();
                                for (int i = 0; i <th.size(); i++) {
                                     sprit.add(th.get(i).getThingPrice());
                                }

                                Comparator<Double> lothi = (j1, j2) -> j1.compareTo(j2);
                                sprit.sort(lothi);
                                System.out.println(sprit);
                                for (int i = 0; i < sprit.size(); i++) {
                                    for (int k = 0; k < th.size(); k++) {
                                        if (sprit.get(i).equals(th.get(k).getThingPrice())) {
                                            lowToHigh.add(th.get(k));
                                        }
                                    }

                                }
                                for(Things i:lowToHigh) {
                                    System.out.println(i.getProduct());
                                }
                                order();
                                break;
                            case 2:
                                this.lowToHigh = new ArrayList<>();
                                this.sprit = new ArrayList<>();
                                //sprit.clear();
                                for (int i = 0; i < th.size(); i++) {
                                    sprit.add(th.get(i).getThingPrice());
                                }
                                Comparator<Double> hitlo = (j1, j2) -> j2.compareTo(j1);
                                sprit.sort(hitlo);
                                System.out.println(sprit);
                                for (int i = 0; i < sprit.size(); i++) {
                                    for (int j = 0; j < th.size(); j++) {
                                        if (sprit.get(i).equals(th.get(j).getThingPrice())) {
                                           lowToHigh.add(th.get(j));
                                        }
                                    }
                                }
                                for (int i = 0; i < lowToHigh.size(); i++) {
                                    System.out.println(lowToHigh.get(i).getProduct());
                                }
                                order();
                                break;
                            case 3:
                                filterSearch();
                                break;
                            default:
                                flag = true;
                                System.out.println(" in-valid option ");
                                break;
                        }
                    } while (flag);
                    break;
                case 2:
                    //search brand
                    this.lowToHigh = new ArrayList<>();
                    String mty = scanner.nextLine();
                    System.out.print("Search Brand  :");
                    String brand = scanner.nextLine();
                    this.br=new ArrayList<>();
                    br.add(brand);
                    for (Things i:th) {
                        if (i.getThingBrand().equals(brand)) {
                             lowToHigh.add(i);
                        }
                    }
                    for(Things i:lowToHigh) {
                        System.out.println(i.getProduct());
                    }
                    if (lowToHigh.size() > 0) {
                        order();
                    }
                    else {
                        System.out.println("invalid brand ...");
                        filterSearch();
                    }
                    break;
                case 3:
                    //fiter cost
                    this.lowToHigh = new ArrayList<>();
                    System.out.println(" Price Filter ......");
                    String mt = scanner.nextLine();
                    System.out.print("Enter lowest amount :");
                    double low = scanner.nextDouble();
                    System.out.print("Enter highest amount :");
                    Double high = scanner.nextDouble();
                    for (int i = 0; i < th.size(); i++) {
                        double s = th.get(i).getThingPrice();
                        if (s > low && s < high) {
                            lowToHigh.add(th.get(i));
                        }
                    }
                    if (lowToHigh.size() > 0) {
                        for(Things i:lowToHigh) {
                            System.out.println(i.getProduct());
                        }
                    }
                    else {
                        System.out.println("in-valid amounts ......");
                        filterSearch();
                    }
                    order();
                    break;
                default:
                    break;
            }
        } while (flag);
    }

    public void order() throws Exception {

       this.sprit = new ArrayList<>();
        sprit.clear();
        System.out.println("number of products = "+lowToHigh.size());
        int size = lowToHigh.size();
        if(size == 1){
             price += lowToHigh.get(0).getThingPrice();
        }
        else {
            for (int i = 0; i < lowToHigh.size(); i++) {
                sprit.add(lowToHigh.get(i).getThingPrice());
            }
            System.out.print("select product(0-" + (size - 1) + ") :");
            int selection = scanner.nextInt();

            if (selection > lowToHigh.size()) {
                order();
            } else if (lowToHigh.size() == 0) {
                select();
            }

            for (int i = 0; i < sprit.size(); i++) {
                if (i == selection) {
                    price += sprit.get(i);
                }
            }
        }
        lowToHigh.clear();
        th.clear();
        sprit.clear();
        pt.product.clear();
        get.clear();
        boolean flag = true;
        do{
            flag =  false;
            System.out.println("1) Add product ");
            System.out.println("2) payment");
            System.out.print("Enter the option :");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    addproduct();
                    break;
                case 2:
                    payment();
                    break;
                default:
                    flag = true;
                    System.out.println("in-valid option ...");
                    break;
            }
        }while(flag);

    }


    public void addproduct() throws Exception {
        boolean flag = true;
        do {
            flag = false;
            System.out.println("Add more product ...... ");
            System.out.println("1) yes ");
            System.out.println("2) no  ...... ");
            System.out.println("3) Exit  ...... ");
            System.out.print("chooce your option  : ");
            int chooce = scanner.nextInt();
            switch (chooce) {
                case 1:
                    select();
                    break;
                case 2:
                    System.out.println("should not more product");
                    break;
                case 3:
                    System.out.println(".............. Thank you ...........");
                    break;
                default:
                    flag = true;
                    System.out.println("In-valid option ........");
            }
        } while (flag);
    }
    public void payment() throws Exception {
        HowToPay howtopay = new HowToPay();
        DelivaryBoy boy = new DelivaryBoy();
        DeliveryDetails del = new DeliveryDetails();
        SignUp sign = new SignUp();
        del.delivaryDetails();
        boy.delivaryBoyList();
        boolean flag = true;
        do {
            flag = false;
            System.out.println("Total amount of Price is rs."+price);
            System.out.println("1) cash on delivary ....");
            System.out.println("2) UPI payment....");
            System.out.println("3) Depit Card Payment");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    PayMent payment = new cashOnDelivary();
                    System.out.println("confirm your order .....");
                    for(String i : del.deli){
                        Thread.sleep(4000);
                        if(i.equals("Delivered...  \n"+LocalDate.now().plusDays(4))){
                            System.out.println(boy.deliboy.get(0).getDelivaryBoy());
                            Thread.sleep(100);
                            System.out.println("\ncalled mobile number is Delivary boy :"+boy.deliboy.get(0).getMobileno()+"\ncalling mobile number is user :"+u.signups.get(0).getMobileNo()+"\nRinging....\nDelivary boy said,your order come to your home.so,pay and collect ");
                            System.out.print("Enter pay amount :");
                            double pay = scanner.nextDouble();
                            String balance = howtopay.payments(payment, price, pay);
                            System.out.println("Your balance : " + balance);
                        }
                        else {
                            System.out.println(i+"\n");
                        }
                    }
                    break;
                case 2:
                    PayMent payment2 = new UPI_Payment();
                    System.out.println("Enter How much money is there in your Account ");
                    double account = scanner.nextDouble();
                    String balance1 = howtopay.payments(payment2, price, account);
                    if (balance1.equals("Payment successfully ")) {
                        System.out.println("confirm your order  ......");
                        for (String i : del.deli) {
                            Thread.sleep(4000);
                            if (i.equals("Delivered...  \n" + LocalDate.now().plusDays(4))) {
                                System.out.println(boy.deliboy.get(0).getDelivaryBoy());
                                Thread.sleep(100);
                                System.out.println("\ncalled mobile number is Delivary boy :" + boy.deliboy.get(0).getMobileno() + "\ncalling mobile number is user :" + u.signups.get(0).getMobileNo() + "\nRinging....\nDelivary boy said,your order come to your home.so,collect ");
                            } else {
                                System.out.println(i+"\n");
                            }
                        }
                     }
                    else {
                        System.out.println("cancel your order ......");
                    }
                    break;
                case 3:
                    PayMent payment3 = new DepitCard_payment();
                    System.out.println("Enter How much money is there in your Account ");
                    double account1 = scanner.nextDouble();
                    String balance2 = howtopay.payments(payment3, price, account1);
                    //System.out.println(" "+balance1);
                    if (balance2.equals("payment successfully ")) {
                        System.out.println("confirm your order  ......\n");
                        for (String i : del.deli) {
                            Thread.sleep(4000);
                            if (i.equals("Delivered...  \n" + LocalDate.now().plusDays(4))) {
                                System.out.println(boy.deliboy.get(0).getDelivaryBoy());
                                Thread.sleep(100);
                                System.out.println("\ncalled mobile number is Delivary boy :" + boy.deliboy.get(0).getMobileno() + "\ncalling mobile number is user :" + u.signups.get(0).getMobileNo() + "\nRinging....\nDelivary boy said,your order come to your home.so,collect ");
                            } else {
                                System.out.println(i+"\n");
                            }
                        }
                    }
                    else {
                        System.out.println("cancle your order ......");
                    }
                    break;
                default:
                    flag = true;
                    System.out.println("in-valid option  ....");
                    break;
            }
        } while (flag);
        System.out.println("---------------THANK YOU---------------");
    }
}



