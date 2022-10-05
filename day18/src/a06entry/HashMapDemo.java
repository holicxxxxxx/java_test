package a06entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();
        
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);
        
        
        hm.put(s1, "江苏");
        hm.put(s2, "洛城");
        hm.put(s3, "黑水");
        hm.put(s4, "裸羊");

        Set<Student> students = hm.keySet();
        for (Student student : students) {
            String s = hm.get(student);
            System.out.println(student+"="+s);
        }
        System.out.println("---------------------------");

        Set<Map.Entry<Student,String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }
        System.out.println("------------------------------");

        hm.forEach(( key, value)-> System.out.println(key+"="+value));

    }
}
