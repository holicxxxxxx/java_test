package mygenerics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}
    /*当有多个不确定类型的方法在一个类中的时候,单个泛型无法满足所有的方法,
    * 这时候需要用到泛型方法,一个泛型的作用范围只有它所对应的方法体里面
    * 声明泛型方法的时候,要把泛型放到所有修饰符的后面
    * 传递泛型的具体类型后,传递数据,可以传入该类类型或者自类类型,注意是传递数据!!
    * 默认泛型是Object
    * 但是泛型不具有继承性,传递数据,数据具有继承性!!!,可以add一个子类的泛型,但是子类泛型不可以直接调用参数是父类泛型的方法
    * */

    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3){
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }
    //可变参数 ,类似python的args
    public static<E> void addAll2(ArrayList<E> list,E...e){
        for (E element : e) {
            list.add(element);
        }
    }
    public void show(){
        System.out.println("四月一日");
    }
}
