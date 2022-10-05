package com.holicxxx.demo2.day13;

public class Teacher extends Employee{
    public Teacher(String name, int id) {
        super(name, id);
    }

    public Teacher() {
    }

    @Override
    public void work(){

        System.out.println("教研");
    }
}
