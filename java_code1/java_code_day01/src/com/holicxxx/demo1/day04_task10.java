package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task10 {
    public static void main(String[] args) {
        int num01=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        int temp =num;
        while(temp!=0){
            int x=temp%10;
            temp=temp/10;
            num01=num01*10+x;
        }
        if (num01==num){
            System.out.println("是");
        }else System.out.println("否");
    }
}
