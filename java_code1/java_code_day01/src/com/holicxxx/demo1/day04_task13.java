package com.holicxxx.demo1;

public class day04_task13 {
    public static void main(String[] args) {
        int num=2100;
        for (int i = num; i >= 1988; i--) {
            if((i%4==0&&i%100!=0)||(i%400==0)){
                System.out.println(i);
            }
        }
    }
}
