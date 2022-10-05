package com.holicxxx.demo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day04_problem01 {
    public static void main(String[] args) {
/*        for(int i=1 ;i<5 ;i++){
            int sum=0;
            sum=sum+i;
            //每次循环会重置循环体内部变量,但是控制循环的变量不会被重置
            System.out.println(sum);
        }
*/
        ////////////////////////////////////////////////////////////////////////////////////////////////
/*    double thickness=0.1;
    int count =0;
    while(thickness<8844430){
        thickness=thickness*2;
        count++;


    }
    System.out.println(count);*/
        /////////////////////////////////////////////////////////////////////////////
      /*  Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        int a =num;
        int number =0;
        while(a!=0){
            int c=a%10;
            a/=10;
            number=c+number*10;
        }
        if (num==number){
            System.out.println(true);

        }else{
            System.out.println(false);
        }*/

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入");
        int num =sc.nextInt();
        int square =0;
        //num.fori
        for (int i = 1; i <= num; i++) {
            if(i*i==num){
                if(i*i==num){
                    System.out.println(i);
                    break;
                }else if(i*i>num){
                    System.out.println(i-1);
                    break;
                }
            }
        }
    }
}
