package a05myset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("number1",23);
        Student s2 = new Student("number2",24);
        Student s3 = new Student("number3",25);
        Student s4 = new Student("number4",26);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s3);
        ts.add(s1);
        ts.add(s4);
        ts.add(s2);

        System.out.println(ts);
    }
}
