package com.holicxxx.demo1;

import java.util.Scanner;

public class day03_problem04 {
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入:");
        int wine =sc.nextInt();
    //一句的时候大括号可以省略,但是像a=10这种其实是两句不可省略,尽量不要省
        if(wine>2) {
            System.out.println("to strong");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int num = sc.nextInt();
        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("做左侧");
            } else {
                System.out.println("坐右侧");
            }
        }

    }
}

