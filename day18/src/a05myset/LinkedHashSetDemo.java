package a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int a = it.next();
            System.out.println(a);
        }

        System.out.println("---------------------------------");

        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println("----------------------------------");


        ts.forEach(i -> System.out.println(i));
    }
}
