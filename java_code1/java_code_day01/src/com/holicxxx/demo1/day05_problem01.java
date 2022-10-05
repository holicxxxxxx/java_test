package com.holicxxx.demo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day05_problem01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month =sc.nextInt();
        System.out.println("请输入舱位");
        int seat =sc.nextInt();
        if (month>=5 &&  month<=10){
            extracted(ticket, seat, 0.9, 0.85);
        }else if ((month>=1 && month <=4) || (month>=11 && month<=12)){
            extracted(ticket, seat, 0.7, 0.65);
            //getPrice(ticket,seat,0.9,0.85);
        }
    }
//ctrl+alt+m抽取函数
//ctrl+p查找函数参数

    private static void extracted(int ticket, int seat, double v, double v2) {
        if (seat == 0) {
            ticket = (int) (ticket * v);
        } else if (seat == 1) {
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("无此舱位");
        }
    }
/*    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat==0){
            ticket=(int)(ticket*0.9);
        }else if (seat==1){
            ticket=(int)(ticket*0.85);
        }else{
            System.out.println("无此舱位");
        }*/
        
    }

