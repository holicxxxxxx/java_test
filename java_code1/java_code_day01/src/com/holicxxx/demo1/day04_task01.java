package com.holicxxx.demo1;

public class day04_task01 {
    public static void main(String[] args) {
        int price = 7988;
        double plan1=price-1500;
        double plan2=price*0.8;
        if(plan1>plan2){
            System.out.println("方案二更省");

        }else if(plan1<plan2){
            System.out.println("方案一更省");
        }else System.out.println("一样");
    }
}
