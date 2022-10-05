package integerdemo;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("23",8);


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);


        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6==i7);

    }



}
