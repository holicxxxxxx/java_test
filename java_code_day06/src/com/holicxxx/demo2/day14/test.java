package com.holicxxx.demo2.day14;

public class test {
    public static void main(String[] args) {
        Cat c=new Cat(3,"灰");
        Dog d=new Dog(2,"黑");
        Person laowang=new Person("老王",30);
        Person laoli=new Person("老李",25);
        laoli.keepAnimal(c,"鱼");
        laowang.keepAnimal(d,"骨头");
    }
}
