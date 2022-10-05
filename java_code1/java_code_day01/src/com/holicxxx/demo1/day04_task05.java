package com.holicxxx.demo1;

import java.util.Scanner;

public class day04_task05 {
    public static void main(String[] args) {
        double num=0;
        double num01=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入工资");
        double salary =sc.nextInt();
        if(salary-salary*0.1 >= 5000){
            num01=salary-salary*0.1-5000;
            if(num01<=3000){
                num=salary-num01*0.03-salary*0.1;
            }else if (num01>3000&&num01<=12000){
                num=salary-3000*0.03-(num01-3000)*0.1-salary*0.1;
            }else if(num01>12000&&num01<=25000){
                num=salary-3000*0.03-9000*0.1-(num01-12000)*0.2-salary*0.1;
            }else if(num01>25000&&num01<=35000){
                num=salary-3000*0.03-9000*0.1-13000*0.2-(num01-25000)*0.25-salary*0.1;
            }else if (num01>35000&&num01<55000){
                num=salary-3000*0.03-9000*0.1-13000*0.2-10000*0.25-(num01-35000)*0.3-salary*0.1;
            }else if (num01>55000&&num01<=80000){
                num=salary-3000*0.03-9000*0.1-13000*0.2-10000*0.25-20000*0.3-(num01-55000)*0.35-salary*0.1;
            }else if(num01>80000){
                num=salary-3000*0.03-9000*0.1-13000*0.2-10000*0.25-20000*0.3-25000*0.35-(num01-80000)*0.45-salary*0.1;
            }

        }else{
            num=salary-salary*0.1;
        }
        System.out.println(num);
    }
}
