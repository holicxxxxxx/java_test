package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo04 {
    public static void main(String[] args) {
/*        Collection系列集合的三种通用遍历方式:
        1.迭代器遍历;
        2.增强遍历;
        3.lambda表达式遍历;*/
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        for (String s : coll) {
            System.out.println(s);
        }
        for (String s : coll) {
            s = "qqq";
            //修改增强for中的变量,不会改变集合中原本的数据,s为第三方变量,在遍历中交给第三方s进行记录
        }//coll+for自动生成
        System.out.println(coll);

//        coll.forEach(new Consumer<String>() {
//            //方法底层会遍历集合,依次得到每一个元素,并且会将元素传递给cosumer的accept方法
//            @Override
//            //依次表示集合中的每一个数据
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
            coll.forEach(s->System.out.println(s));
    }
}
