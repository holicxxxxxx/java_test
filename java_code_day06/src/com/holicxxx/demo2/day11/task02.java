package com.holicxxx.demo2.day11;

import java.util.ArrayList;

public class task02 {
    public static void main(String[] args) {
        ArrayList<Teacher> array=new ArrayList<>();
        Teacher t1=new Teacher("赵老师","javase");
        Teacher t2=new Teacher("钱老师","javaee");
        Teacher t3=new Teacher("孙老师","php");
        Teacher t4=new Teacher("李老师","python");
        array.add(t1);
        array.add(t2);
        array.add(t3);
        array.add(t4);
        for (int i = 0; i < array.size(); i++) {
            Teacher temp=array.get(i);
            System.out.printf("姓名:%s,专业:%s",temp.getName(),temp.getWork());
            System.out.println();
        }
//        array.add("姓名：钱老师, 专业：javaee");

//        array.add("姓名：孙老师, 专业：php");
//        array.add("姓名：李老师, 专业：python");
    }
}
//alt+enter!!!!!!查询红线的解决方案
//ctrl+f12==查询所有的该类的函数

