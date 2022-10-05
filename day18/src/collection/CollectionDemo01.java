package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        //1.如果我们要往List系列集合中添加数据,那么方法永远返回true,因为List系列的是允许元素重复的.
        //2.如果我们要往Set系列集合中添加数据,如果当前要添加的元素不存在,方法返回true,表示添加成功.如果当前要添加的
        //元素已经存在,方法返回false,表示添加失败,因为Set系列的集合不允许重复.
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
//        coll.clear();//2.清空
        System.out.println(coll.remove("aaa"));//返回boolean类型
        //3.因为collection里面定义的方法是共性的方法,所以此时不能通过索引进行删除,只能通过元素对象进行删除
        //方法会有一个Boolean类型的返回值,删除成功返回true,删除失败返回false
        //如果要删除的元素不存在,就会删除失败
        System.out.println(coll);
//        4.判断元素是否包含
//            细节:底层是依赖equals方法进行判断是否存在的
//            所以如果集合中存储的是自定义对象,也想通过cantains方法进行判断是否包含,那么在javabean类中,要重写equals的fangfa
//
        boolean result = coll.contains("bbb");
        System.out.println(result);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        int size = coll.size();
        System.out.println(size);
    }
}
