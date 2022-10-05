package com.holicxxx.demo2.day10;

import java.util.Scanner;

public class task06_wrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身份证");
        String str=sc.next();
        if(islegal(str)){
            System.out.println("输入合法");
        }else System.out.println("输入不合法");

    }
    public static boolean islegal(String str){
        if (str==null) return false;
        else if(str.startsWith("0")) return false;
        else if(str.length()!=18) return false;
        for (int i = 0; i < str.length()-1; i++) {
            int num =str.charAt(i);
            if(num<48||num>=58) return false;
        int temp=str.charAt(str.length()-1);
        if(temp<48||(temp>=58&&temp<65)||temp>=92) return false;
        }
        return true;
    }
}
