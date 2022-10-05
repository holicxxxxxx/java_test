package com.holicxxx.demo1;

import java.util.Scanner;

public class day03_task07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int num=sc.nextInt();
        int a=num%10;
        int b=num/10%10;
        int c=num/10/10%10;
        System.out.println(a+b+c);
    }
}
