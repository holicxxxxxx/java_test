package com.holicxxx.demo2.test8;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字");
        String str=sc.next();
        if(examine(str)){
            strr(str);
        }else{
            System.out.println("重新输入");
        }

    }
    public static boolean examine(String str){
        for (int i = 0; i < str.length(); i++) {
            char a =str.charAt(i);
            if(a<48&&a>57){
                return false;
            }
        }
        if (str.length()>9) return false;
        return true;
    }
    public static void strr(String arr){
        String[] temp=new String[]{" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            int index=change(arr,i);
            sb.append(temp[index]);
        }
        System.out.println(sb);
        }


    public static int change(String str,int index){
        int temp=str.charAt(index)-48;
        return temp;
    }
}
