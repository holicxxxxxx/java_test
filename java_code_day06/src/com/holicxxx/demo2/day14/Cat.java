package com.holicxxx.demo2.day14;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat (String someting){
        System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s",getAge(),getColor(),someting);
        System.out.println();
    }
    public void catchHouse(){
        System.out.println("逮老鼠");
    }
}
