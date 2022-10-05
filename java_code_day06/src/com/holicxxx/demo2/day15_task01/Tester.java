package com.holicxxx.demo2.day15_task01;

public class Tester {
    public static void main(String[] args) {
        Shape[] shapes={
                new Rectangle(5,10),
                new Square(3)
        };
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].Area());
            System.out.println(shapes[i].perimeter());
            //为啥父类没有定义的变量还未报错？
            //shapes[i].length
          /*  if (shapes[i] instanceof Rectangle r){
                System.out.println(r.Area());
                System.out.println(r.perimeter());
            }else if(shapes[i] instanceof Square s){
                System.out.println(s.perimeter());
                System.out.println(s.Area());
            }*/
        }
    }
}
