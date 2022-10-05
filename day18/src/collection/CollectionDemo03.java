package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> coll =new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();
        //迭代器遍历不依赖索引
//      1.报错NoSunchElementException
//      2.迭代器遍历完毕,指针不会复位
//      3.循环中只能用一次next方法,一般和while的hasNext配套使用
//      4.迭代器遍历时,不能用集合的方法进行增加或者删除,只能用迭代器的自带方法进行删除,添加暂时没有办法
        while (it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
//                coll.remove("bbb");
                it.remove();
                //Exception in thread "main" java.util.ConcurrentModificationException
            }
            System.out.println(str);
        }
//        System.out.println(it.next());
        //Exception in thread "main" java.util.NoSuchElementException
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
    }

}
