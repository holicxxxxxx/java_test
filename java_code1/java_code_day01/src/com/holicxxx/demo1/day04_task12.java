package com.holicxxx.demo1;

public class day04_task12 {
    public static void main(String[] args) {
        int num =2019;
        for (int i = num; i >= 1949; i--) {
            if((num-i)%12==0){
                System.out.println(i);
            }
        }
    }
}
