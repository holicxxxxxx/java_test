package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        Iterable<String> it = list.iterator();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
// 并发修改异常    Exception in thread "main" java.util.ConcurrentModificationException
                //list.add("qqq");
            }
            System.out.println(str);
        }

        for (String s : list){
            System.out.println(s);
        }

        list.forEach( s-> System.out.println(s));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        ListIterator<String> it1 = list.listIterator();
        while (it.hasNext()){
            String str =it.next();
            if (str == "bbb"){
                it1.add("qqq");//列表迭代器可以允许添加元素
            }
        }
        System.out.println(list);
    }
}
