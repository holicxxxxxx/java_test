package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入类别");
        double total=0;
        while (true){
            int num =sc.nextInt();
            double cost =sc.nextInt();
            if (num ==0){
                if(cost>=100){
                    total=cost*0.9;
                }else total=cost;
            }else if (num == 1) {
                if(cost<=200){
                    total=cost*0.75;
                }else total=cost*0.8;
            }else continue;
            break;
        }
        System.out.println(total);
    }
}
