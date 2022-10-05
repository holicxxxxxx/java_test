package com.holicxxx.demo1;

public class day05_task02 {
    public static void main(String[] args) {
        double[] str=new double[]{12.9,53.54,75.0,99.1,3.14};
        double temp=str[0];
        for (int i = 1; i < str.length; i++) {
            if(temp>=str[i]){
                temp=str[i];
            }
        }
        System.out.println(temp);
    }
}
