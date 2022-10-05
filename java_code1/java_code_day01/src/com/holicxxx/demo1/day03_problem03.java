package com.holicxxx.demo1;

public class day03_problem03 {
    public static void main(String[] args) {
        //+=,-=,*=,/=,%= 底层存在强制转换
        short s = 1;
        //System.out.println(1<s<2);
        s += 1;   //s=(short)(s+1)
        System.out.println(s);
    }
}
