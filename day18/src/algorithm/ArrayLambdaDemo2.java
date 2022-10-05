package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
//Lambda省略核心:可推导,可省略
//参数类型可以省略不写.
//如果只有一个参数,参数类型可以省略,同时()也可以省略.
//如果Lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略.

public class ArrayLambdaDemo2 {
    public static void main(String[] args) {
        Integer[] arr= {2,3,1,5,6,7,8,4,9};
//        Arrays.sort(arr, (Integer o1, Integer o2)-> {
//                return o1-o2;
//            }
//        );
//省略写法
//        Arrays.sort(arr, (o1,o2)-> {
//                    return o1 - o2;
//                }
//        );

        Arrays.sort(arr, (o1,o2)-> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}
