package com.holicxxx.demo2.test5;

public class demo5 {
    public static void main(String[] args) {
        Role role=new Role("乔峰",100,"女");
        Role role1=new Role("鸠摩智",100,"男");
        while (true){
            role.attack(role1);
            if(role1.getBlood()==0){
                System.out.println(role.getName()+"K.O了"+role1.getName());
                break;
            }
            role1.attack(role);
            if(role.getBlood()==0) {
                System.out.println(role1.getName() + "K.O了" + role.getName());
                break;
            }
        }
    }
    public static void str(Role role){
        //role.name
    }
}
