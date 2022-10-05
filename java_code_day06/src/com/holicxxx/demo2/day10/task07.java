package com.holicxxx.demo2.day10;

import java.util.StringJoiner;

public class task07 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        System.out.println(changeArr(arr));
    }
    public static String changeArr(int[] arr){
        if (arr==null) return null;
        if (arr.length==0) return "[]";
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            int temp =arr[i];
            if(i==arr.length-1){
                str=str+temp+"]";
            }else{
                str=str+temp+",";
            }
        }
        return str;
    }
    public static String arrarToString(int[] arr){
        if(arr ==null){
            return null;
        }
        StringJoiner sj =new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }

}
