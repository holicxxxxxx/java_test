package a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("张三");//返回False,其余返回True
        s.add("李四");
        s.add("王五");

        System.out.println(s);
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String temp = it.next();
            System.out.println(temp);
        }

        for (String s1 : s) {
            System.out.println(s1);
        }

        s.forEach(str ->System.out.println(str));
    }
}
