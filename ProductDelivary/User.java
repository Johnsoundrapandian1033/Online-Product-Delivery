package com.ProductDelivary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class User {
    Scanner scanner = new Scanner(System.in);
    ArrayList<SignUp>signups = new ArrayList<>();
    ArrayList<Address>ad = new ArrayList<>();
    public void user() {
        boolean flag = true;
        User u = new User();
        List<SignUp> signup = new ArrayList<>();
        System.out.print("Enter the user Name :");
        String userName = scanner.nextLine();
        String userId;
        do{
            System.out.print("Enter the gMail Id :");
            flag = false;
            int c=0,count = 0;
             userId = scanner.nextLine();
            for(int i :userId.toCharArray()){
                count += 1;
                if(i=='@') break;
            }
            char[] d="@gmail.com".toCharArray();
            char[] e=userId.toCharArray();
            for(int i =0 ,j= count-1;i< d.length   ;i++,j++){
                if(i<d.length && j<e.length) {
                    if (d[i] == e[j]) {
                        c = 1;
                    } else {
                        c = 0;
                        break;
                    }
                }
                else {
                    c= 0;
                    break;
                }
            }
            if(c!=1){
                flag = true;
                System.out.println("In-valid User Id. ex:XXXX@gmail.com .....");
            }

        }while(flag);
        String passWord;
        do {
            flag = false;
            System.out.print("Enter Password :");
             passWord = scanner.nextLine();
            int spl =0,cap = 0,count =0;
            for(int i:passWord.toCharArray()){
                count++;
                if(i=='@'|| i=='#'||i=='*'||i=='$'||i=='!'||i=='^'||i=='&'||i=='|'||i=='?'||i=='<'||i=='>'||i=='/'){
                    spl++;
                }
                else if(i>='A' && i<='Z'){
                    cap++;
                }
            }
            if(count>=8 && 15>=count && cap==1 && spl==1);
            else{
                flag = true;
                System.out.println("In-valid password .must password count 8 - 15 characters including one captial letter and one Special character.....");
            }
        }while(flag);
        long mobile_No;
        do {
            flag = false;
            System.out.print("Enter mobile number :");
            mobile_No = scanner.nextLong();
            if(7700000000l<mobile_No && 9999999999l>mobile_No);
            else{
                flag = true;
                System.out.println("In-valid mobile number.please enter 10counts number.....");
            }
        }while(flag);
        Gender gender = null;
        do {
            flag = false;
            System.out.println("1) MALE");
            System.out.println("2) FEMALE");
            System.out.println("3) TRANCE_GENDER");
            System.out.print("Enter your option :");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    gender = Gender.MALE;
                    break;
                case 2:
                    gender = Gender.FEMALE;
                    break;
                case 3:
                    gender = Gender.TRANSGENDER;
                    break;
                default:
                    flag = true;
                    System.out.println("in-valid option ...");
                    break;
            }
        } while (flag);
         String mty = scanner.nextLine();
         System.out.println("Enter your Address details .....");
         System.out.print("Enter door No.  : ");
         String door_No = scanner.nextLine();
        System.out.print("Enter Street  : ");
         String street =scanner.nextLine();
        System.out.print("Enter home Town Name  : ");
         String town_name = scanner.nextLine();
        System.out.print("Enter district  : ");
         String district = scanner.nextLine();
        System.out.print("Enter state  : ");
         String state = scanner.nextLine();
        long pin_code;
        do {
            flag =false;
            System.out.print("Enter pin code  : ");
            pin_code = scanner.nextLong();
            if(100000<pin_code && 999999>pin_code);
            else{
                flag = true;
            }
        }while (flag);

        ad.add(new Address(door_No,street,town_name,district,state,pin_code));
        signups.add(new SignUp(userName, userId, passWord, mobile_No, gender,ad));
    }
    List<LogIn>log = new ArrayList<>();
    public void logIn(){
        String empty = scanner.nextLine();
        System.out.print("Enter userId :");
        String userId  = scanner.nextLine();
        System.out.print("Enter password :");
        String password = scanner.nextLine();
        if(signups.get(0).getUserId().equals(userId) && signups.get(0).getPassWord().equals(password)) {
            log.add(new LogIn(userId, password));
        }
    }
    public void forgotPassword(){
        for(LogIn i:log){
            System.out.println(i.getLogIn());
        }
        System.out.println("forgot password ....");
        System.out.println("Enter your new password ....");
        String password;
        boolean flag;
        do {
            flag = false;
            System.out.print("Enter Password :");
            password = scanner.nextLine();
            int spl =0,cap = 0,count =0;
            for(int i:password.toCharArray()){
                count++;
                if(i=='@'|| i=='#'||i=='*'||i=='$'||i=='!'||i=='^'||i=='&'||i=='|'||i=='?'||i=='<'||i=='>'||i=='/'){
                    spl++;
                }
                else if(i>='A' && i<='Z'){
                    cap++;
                }
            }
            if(count>=8 && 15>=count && cap==1 && spl==1);
            else{
                flag = true;
            }
        }while(flag);
        System.out.print("confirm your password :");
        String pass = scanner.nextLine();
        User u =new User();
        signups.get(0).getPassWord().replaceAll(log.get(0).getPassword(),password) ;
        for(LogIn i:log){
            System.out.println(i.getLogIn());
        }
    }
}
