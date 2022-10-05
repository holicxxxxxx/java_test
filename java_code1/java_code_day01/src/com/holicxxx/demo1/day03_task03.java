package com.holicxxx.demo1;

public class day03_task03 {
    public static void main(String[] args) {
        int Fish_Flavored_pork = 24;
        int peanut = 8;
        int rice = 3;
        double amount01 = Fish_Flavored_pork + peanut + rice >= 30 ? (Fish_Flavored_pork + peanut + rice) * 0.8 : Fish_Flavored_pork + peanut + rice;
        double amount02 = Fish_Flavored_pork + peanut + rice - 16;
        double amount03 = amount01 > amount02 ? amount01 : amount02;
        System.out.println(amount03);
    }
}
