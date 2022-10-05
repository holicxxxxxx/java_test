package com.holicxxx.demo1;

public class day05_task05 {
    public static void main(String[] args) {
        int[] str = new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum=0;
        for (int i = 0; i < str.length; i++) {
            sum=str[i]+sum;

        }
        double average=sum/str.length;
        System.out.println(average);


    }
}
