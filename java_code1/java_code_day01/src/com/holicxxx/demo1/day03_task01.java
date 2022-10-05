package com.holicxxx.demo1;

public class day03_task01 {
    public static void main(String[] args) {
        double father_height = 177.0;
        double mother_height = 165.0;
        double son_height = (father_height + mother_height) * 1.08 / 2;
        double daughter_height = (father_height * 0.923 + mother_height) / 2;
        System.out.println("儿子身高是" + son_height + "CM");
        System.out.println("女儿身高是" + daughter_height + "CM");
//        System.out.println (double cc = (father_height * 0.923 + mother_height) / 2);
    }
}
