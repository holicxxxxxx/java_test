package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入");
        int num= sc.nextInt();
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        //可否一次录入多个
        int temp=num>num1?num1:num;
        int temp01=temp>num2?num2:temp;
        System.out.println(temp01);
    }
}
