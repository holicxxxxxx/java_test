package com.holicxxx.demo2.test1;

public class Smart {
    private String brand;
    private double price;
    private String color;

    public Smart(){
    }
    public Smart(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void call(){
        System.out.printf("正在使用价格为%.0f元%s的%s手机打电话...",price,color,brand);
    }
    public void sendMessage(){
        System.out.printf("正在使用价格为%.0f元%s的%s手机发短信...",price,color,brand);
    }
}
