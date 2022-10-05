package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        list.add(1,"qqq");//添加到指定索引处,之后的元素往后移
        System.out.println(list);
        String remove = list.remove(0);//带有索引的remove是方法重载后的,原来是直接删除元素
        System.out.println(remove);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //因为调用方法的时候,如果方法出现了重载现象
        //优先调用,实参跟形参类型一致的那个方法,因为若是删除值的话过于麻烦,需要装箱
        list1.remove(1);
        //若要删除0索引上的数值
//        list.remove(0);
        Integer i =Integer.valueOf(1);//手动装箱
        list1.remove(i);
        System.out.println(list1);


        //----------------------------------------------
        String result = list.set(0, "QQQ");//并且返回原有的元素
        System.out.println(result);
        System.out.println(list);

        //-------------------------------------------------
        String s = list.get(0);
        System.out.println(s);
    }
}
