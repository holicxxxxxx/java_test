package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task08 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num01 =sc.nextInt();
        System.out.println("请输入第二个数字");
        int num02 =sc.nextInt();
        if(num01>=num02){
            for ( ; num02 <= num01; num02++) {
                if (num02%3==0&&num02%5==0){
                    count++;
                }
            }
            System.out.println("共有"+count+"个数");
        }else{
            for (; num01 <= num02; num01++) {
                if (num01%3==0&&num01%5==0){
                    count++;
                }
            }
        }
        System.out.println("共有"+count+"个数");
    }
}
