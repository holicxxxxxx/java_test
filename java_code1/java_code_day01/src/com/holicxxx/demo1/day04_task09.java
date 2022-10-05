package com.holicxxx.demo1;

public class day04_task09 {
    public static void main(String[] args) {
        int height = 8844430;
        double thick =0.1;
        int i =0;
        for (; ; i++) {
            if (thick>=height) break;
            thick*=2;
        }
        System.out.println(i);
    }
}
