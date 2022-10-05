package com.holicxxx.demo2.day13_task02;

public class Teacher {
    private int age;
    private String name;
    private String room;

    public Teacher() {
    }

    public Teacher(int age, String name, String room) {
        this.age = age;
        this.name = name;
        this.room = room;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public void showInfo(){
        System.out.println("查看课表");
    }
    public void fillForm(){
        System.out.println("填写听课反馈");
    }
}
