package com.holicxxx.demo2.day15_test01;

public class Outer {
    static class Inner{
        public void show1(){
            System.out.println("非静态的方法被调用了");
        }
        public static void show2(){
            System.out.println("静态的方法被调用了");
        }
    }
}
