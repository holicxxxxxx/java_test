package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num01=sc.nextInt();
        System.out.println("请输入第二个数");
        int num02=sc.nextInt();
        int reminder =0;
        int discuss =0 ;
        while (num01 >= num02){
            num01=num01-num02;
            discuss++;
        }
        reminder=num01;
        System.out.println(discuss);
        System.out.println(reminder);
    }
}
