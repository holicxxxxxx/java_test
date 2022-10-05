package mygenerics;

import java.util.List;

public class GenericsDemo4 {
    /*
    * 泛型接口的两种使用方式
    * 1.实现类中给出具体的类型
    * 2.实现类延续泛型,创建实现类对象时再确定类型*/
    public static void main(String[] args) {
        MyArrayList02 list = new MyArrayList02();
        list.add("aaa");
        MyArrayList03<String> list1 = new MyArrayList03<>();
        list1.add("aaa");

    }
}
