package com.holicxxx.demo2.day15_task02;

public class NewSmart extends SmartPhone implements IPlay{
    @Override
    public void call(){
        System.out.println("重写");
    }
    @Override
    public void send(){
        System.out.println("重写");
    }
    @Override
    public void play() {
        System.out.println("玩新游戏");
    }
}
