package com.holicxxx.demo2.day10;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();
        int aphaNum=0;
        int mathNum=0;
        for (int i = 0; i < str.length(); i++) {
            int num =str.charAt(i);
            if(num>=48&&num<=57){
                mathNum++;
            }else if((num>=97&&num<123)||(num>=65&&num<91)){
                aphaNum++;
            }
        }
        System.out.printf("字母:%d个,数字:%d个",aphaNum,mathNum);
    }



    public static void answer(String[] args) {
        //键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        // 为方便统计，将字符串中的字母都转为小写
        line = line.toLowerCase();
        //要统计两种类型的字符个数，需定义两个统计变量，初始值都为0
        int letterCount = 0;
        int numberCount = 0;
        // 遍历字符串，得到每一个字符
        for(int i=0; i<line.length(); i++) {
            char ch = line.charAt(i);
            // 判断该字符属于哪种类型，然后对应类型的统计变量+1
            if (ch >= 'a' && ch <= 'z') {
                letterCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        //输出两种类型的字符个数
        System.out.println("英文字母：" + letterCount + "个");
        System.out.println("数字：" + numberCount + "个");
    }
}
