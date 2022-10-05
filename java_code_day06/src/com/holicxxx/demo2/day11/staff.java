package com.holicxxx.demo2.day11;

public class staff {
    String name;
    String salary;
    public staff(){

    }
    public staff(String name,String salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSalary(){
        return this.salary;
    }
    public void setSalary(String salary){
        this.salary=salary;
    }
}
