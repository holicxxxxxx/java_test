package com.holicxxx.demo1;

import java.util.Scanner;

public class day03_task06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字两个");
        int num = sc.nextInt();
        int num02=sc.nextInt();
        if (num == 6 || num02 ==6  || (num + num02) % 6 == 0) {
            System.out.println("true");

        }else {
            System.out.println("false");
        }
    }
}
