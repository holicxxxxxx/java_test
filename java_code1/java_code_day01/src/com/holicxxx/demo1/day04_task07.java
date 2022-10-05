package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num01 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num02 = sc.nextInt();
        int sum=0;
        if(num01>num02) {
            for (; num02 <= num01; num02++) {
                sum = sum + num02;

            }
            System.out.println(sum);
        }else{
                for (; num01 <= num02; num01++) {
                    sum=sum+num01;
                }
            System.out.println(sum);
        }


    }
}
