package com.holicxxx.demo2.day11;

import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) {
        staff worker1=new staff("张三","3000");
        staff worker2=new staff("李四","3500");
        staff worker3=new staff("王五","4000");
        staff worker4=new staff("赵六","4500");
        staff worker5=new staff("田七","5000");
        ArrayList<staff> array=new ArrayList<>();
        array.add(worker1);
        array.add(worker2);
        array.add(worker3);
        array.add(worker4);
        array.add(worker5);
        for (int i = 0; i < array.size(); i++) {
            if ("王五".equals(array.get(i).getName())){
                array.get(i).setName("王小五");
            }
            if ("赵六".equals(array.get(i).getName())){
                array.remove(i--);
            }
            if("田七".equals(array.get(i).getName())){
                array.get(i).setSalary("5500");
            }

        }
        for (int i = 0; i < array.size(); i++) {
            staff w = array.get(i);
            System.out.println(w.getName() + "---" + w.getSalary());
        }
    }
}
