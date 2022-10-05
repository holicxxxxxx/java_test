package com.holicxxx.demo2.day13;

public class AdminStaff extends Employee{
    public AdminStaff(String name, int id) {
        super(name, id);
    }

    public AdminStaff() {
    }

    @Override
    public void work(){
        System.out.println("行政");
    }
}
