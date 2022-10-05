import javax.swing.*;
import java.math.BigInteger;
import java.util.Random;

public class bigint {
    public static void main(String[] args) {
//        BigInteger bd1 =new BigInteger(4,new Random());
//        System.out.println(bd1);
//        BigInteger bd2;
//        bd2 = new BigInteger("9999999999999999999999999999999999999999999999");
//        System.out.println(bd2);
//
////        BigInteger bd3 =new BigInteger("abc");
////        System.out.println(bd3);
//
//        BigInteger bd4 = new BigInteger("100",16);
//        System.out.println(bd4);
//
//        BigInteger bd5 = BigInteger.valueOf(100);
//        System.out.println(bd5);
        BigInteger bd1=BigInteger.valueOf(10);
        BigInteger bd2=BigInteger.valueOf(10);
        //BigInteger bd1 = new BigInteger("10");
        //BigInteger bd2 = new BigInteger("10");
        BigInteger bd3=bd1.add(bd2);
        System.out.println(bd3);
        BigInteger bd4=bd1.subtract(bd2);
        System.out.println(bd4);
        BigInteger bd5=bd1.multiply(bd2);
        System.out.println(bd5);
        BigInteger bd6=bd1.divide(bd2);
        System.out.println(bd6);
        BigInteger[] arr =bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        boolean result = bd1.equals(bd2);
        System.out.println(result);
        BigInteger bd8=bd1.pow(2);
        System.out.println(bd8);
        BigInteger bd7 =bd1.max(bd2);
        System.out.println(bd7);
        BigInteger bd9 = BigInteger.valueOf(3131323333L);
        int i = bd9.intValue();
        System.out.println(i);
        long y=bd9.longValue();
        System.out.println(y);
    }
}
