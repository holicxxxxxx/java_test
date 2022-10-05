package com.holicxxx.demo2.day10;

import java.util.Random;
import java.util.Scanner;

public class task_02nodo {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //把字符串变成字符数组
        char[] arr = str.toCharArray();

        //将数组里面的内容打乱
        //打乱的核心要素：
        //遍历数组得到每一个元素与每一个随机索引处的数据进行交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //将字符数组再变回字符串
        String newStr = new String(arr);

        //输出打印
        System.out.println(newStr);

    }
}
