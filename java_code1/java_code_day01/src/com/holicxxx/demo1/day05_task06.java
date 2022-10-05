package com.holicxxx.demo1;

import java.util.Scanner;

public class day05_task06 {
    public static void main(String[] args) {
        int[] str =new int[]{12,14,23,45,66,68,70,77,90,91};
        //System.out.println(str.length);
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字");
        int num =sc.nextInt();
        int[] str1=new int[(str.length)+1];
        int index =0;
        for (int i = 0; i < str.length; i++) {
            if(num>=str[i]){
                str1[index]=str[i];
                index++;
            }else {
                str1[i+1]=str[i];

            }


        }
        str1[index]=num;
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i]+" ");
        }
    }
}
