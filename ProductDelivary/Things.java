package com.ProductDelivary;

class Things{
    String  thingName;
    String thingBrand;
    double thingPrice;

    Things(String name,String brand,double price){
        thingName = name;
        thingBrand = brand;
        thingPrice = price;
    }
    public void setThingName(String s){
        thingName =  s;
    }
    public void setThingBrand(String s){
        thingBrand =  s;
    }
    public void setThingPrice(double s){
        thingPrice =  s;
    }
    public String getThingName(){
        return thingName;
    }
    public String getThingBrand(){
        return thingBrand;
    }
    public double getThingPrice(){
        return thingPrice;
    }


    public String getProduct(){
        return " product Name  :"+thingName+"    product Company  :"+thingBrand+"    product Price  :"+thingPrice +"\n";
    }

}
/*class Brand{
    String brand;
    Brand(String brand){
        this.brand = brand;
    }
    public void setBrand(String brand){this.brand = brand;}
    public String getBrand(){return brand;}
}*/
