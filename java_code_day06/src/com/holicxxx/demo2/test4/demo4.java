package com.holicxxx.demo2.test4;

public class demo4 {
    public static void main(String[] args) {
        Cat cat=new Cat("花色","波斯猫");
        Dog dog=new Dog();
        cat.eat();
        System.out.println();
        cat.catchMouse();
        System.out.println();
        dog.setBreed("藏獒");
        dog.setColor("黑色");
        dog.eat();
        System.out.println();
        dog.lookHome();
    }

}
