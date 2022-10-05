package a05myset;

import java.util.HashSet;

public class HashSetDemo02 {
//若是String Integer则已经自动写好了hashcode和equals的函数,自定义类则必须重写
//否则相同属性的对象也会被存入sethash中
    public static void main(String[] args) {
    Student s1 = new Student("number1",23);
    Student s2 = new Student("number2",23);
    Student s3 = new Student("number3",23);
    Student s4 = new Student("number4",23);

    HashSet<Student> hs = new HashSet<>();

    System.out.println(hs.add(s1));
    System.out.println(hs.add(s2));
    System.out.println(hs.add(s3));
    System.out.println(hs.add(s4));

    System.out.println(hs);

    //重写和不重写打印效果不一样

    }
}