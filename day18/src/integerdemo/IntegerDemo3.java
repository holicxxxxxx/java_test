package integerdemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        int result = i1.intValue()+i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);
    }


}
