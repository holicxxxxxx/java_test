package com.holicxxx.demo2.day10;

public class task08 {
    public static void main(String[] args) {
        String str="Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int num=statistics(str,"Java");
        System.out.println(num);
    }
    public static int statistics(String str,String test){
        int count =0;
        while (true){
            int temp=str.indexOf(test);
            if(temp==-1) break;
            count++;
            str=str.substring(temp+4);
        }
        return count;
    }
}
