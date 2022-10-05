package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入三个数字");
        int num01=sc.nextInt();
        int num02=sc.nextInt();
        int num=sc.nextInt();
        switch (num){
            case 1:
                int sum =num01+num02;
                System.out.println(num01+"+"+num02+"="+sum);
                break;
            case 2:
                int sum01 =num01-num02;
                System.out.println(num01+"-"+num02+"="+sum01);
                break;
            case 3:
                double sum02=num01*num02;
                System.out.println(num01+"*"+num02+"="+sum02);
                break;
            case 4:
                double sum03=num01/num02;
                System.out.println(num01+"/"+num02+"="+sum03);
                break;
        }
    }
}
