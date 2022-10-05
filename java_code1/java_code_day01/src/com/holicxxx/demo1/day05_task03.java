package com.holicxxx.demo1;

import java.util.Random;

public class day05_task03 {
    public static void main(String[] args) {
        int[] str =new int[6];
        int temp=0;
        Random r=new Random();
        for (int i = 0; i < str.length; i++) {
            str[i]=r.nextInt(-99,1);
            temp=str[i]+temp;
        }
        System.out.println(temp);

    }
}
