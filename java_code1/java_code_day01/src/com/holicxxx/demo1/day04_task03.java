package com.holicxxx.demo1;

import java.security.Principal;
import java.util.Scanner;

public class day04_task03 {
    public static void main(String[] args) {
        double brincipal=0;//若去掉if函数内定义 变量不行,作用域只有大括号内有用
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入金额:");
            int num=sc.nextInt();
            if (num<1000){
                System.out.println("请重新输入");
                continue;

            }else{
                System.out.println("请输入年限");
                int year = sc.nextInt();
                if(year ==1){
                    brincipal=num +num *2.25*year;
                }else if(year ==2){
                    brincipal=num+num*2.7*year;
                }else if(year ==3 || year ==4){
                    brincipal=num+num*3.25*year;
                }else {
                    brincipal=num+num*3.25*year;
                }
                System.out.println(brincipal);
                break;
            }
        }



    }
}
