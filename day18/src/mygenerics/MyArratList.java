package mygenerics;

import java.util.Arrays;
//创建类的对象的时候必须带上泛型
public class MyArratList<E> {
    Object[] obj = new Object[10];
    int size;
    /*E:表示不确定的类型,该类型在类名后面已经定义过了.
    *e:形参的名字,变量名
    * java的泛型是伪泛型,当进入集合的时候java会自动判断是否为泛型类型
    *若是则进入,但是底层会将其变成object类进行存储
    *但因为若如此会无法实现其变量自身类型的功能(因为多态)
    *所以再使用的过程中,会自动将其变成泛型类
    * */

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);//拼接成字符串打印
    }
}
