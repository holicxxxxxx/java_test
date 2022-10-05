package com.holicxxx.demo1;

public class day03_problem02 {
    public static void main(String[] args) {
        //后置++后++,用的少
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
