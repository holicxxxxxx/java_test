package com.holicxxx.demo1;

import java.util.Random;

public class day05_task04 {
    public static void main(String[] args) {
        Random r=new Random();
        int temp=0;
        int[] str =new int[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=r.nextInt(0,10);
            temp=temp*10+str[i];
        }
        System.out.println(temp);
    }

}
