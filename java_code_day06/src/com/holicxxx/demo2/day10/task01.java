package com.holicxxx.demo2.day10;

import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        char[] chr=new char[52];
        for (int i = 0; i < chr.length; i++) {
            if(i<26){
                chr[i]=(char)(97+i);
            }else {
                chr[i]=(char)(65+i-26);
            }

        }
        char[] chars=new char[5];

        Random r=new Random();
        for (int i = 0; i < chars.length-1; i++) {
            int index=r.nextInt(52);
            chars[i]=chr[index];
        }
        chars[(chars.length)-1]=(char)(r.nextInt(48,58));
        chars=change(chars);
        System.out.println(chars);
    }
    public static char[] change(char[] chr){
        Random r=new Random();
        int temp=r.nextInt(4);
        char ch='a';
        for (int i = 0; i < chr.length; i++) {
            ch=chr[temp];
            chr[temp]=chr[i];
            chr[i]=ch;
        }
        return chr;
    }
}
