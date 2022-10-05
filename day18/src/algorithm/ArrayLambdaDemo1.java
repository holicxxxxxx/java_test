package algorithm;

public class ArrayLambdaDemo1 {
    public static void main(String[] args) {
        //写匿名内部类作为参数传递的时候相当于对该函数进行重载而非重写,static方法只能重载,若是编译时自动调用的类可以直接写
        //它的重载函数,属于编译时的多态,而重写是运行时的多态//
        //Lambda表达式可以用来简化匿名内部类的书写
        //Lambda表达式只能简化函数式接口(有且只有一个抽象方法的接口叫函数式接口)的匿名内部类的写法
//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("正在游泳~~~");
//            }
//        });
        method(
                ()->{
                    System.out.println("正在游泳~~~");
                }
        );
        
        
        
        
        
        //可以理解成是一个匿名函数
        method(new Swim() {//删括号之后所有,单删一个大括号
            @Override//删
            public void swimming() {//删括号以前,大括号与小括号之间加箭头
                System.out.println("---");
            }
        });//单删一个大括号
    }
    
    
    public static void method(Swim s){
        s.swimming();
    }
}

@FunctionalInterface//两个不行,因为lambda表达式未写函数名,所以无法推导出重写了哪个函数
interface Swim{
    public abstract void swimming();
}
abstract class Swim1{
    public abstract void swimming();
}