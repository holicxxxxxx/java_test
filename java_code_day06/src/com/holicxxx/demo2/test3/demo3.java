package com.holicxxx.demo2.test3;

public class demo3 {
    public static void main(String[] args) {
        Manager manager=new Manager("张三",144,60000,5000);
        Coder coder=new Coder("李四",133,50000);
        manager.work();
        System.out.println();
        coder.work();
    }
}

