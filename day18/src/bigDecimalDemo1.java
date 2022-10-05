import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Principal;

public class bigDecimalDemo1 {
    public static void main(String[] args) {
        //这种构造有可能不精确
       // BigDecimal bd1 = new BigDecimal(0.01);
//        BigDecimal bd2 = new BigDecimal(0.09);
//        System.out.println(bd1);
//        System.out.println(bd2);
//
//        //超出double的范围
//        BigDecimal bd3 = new BigDecimal("0.01");
//        BigDecimal bd4 = new BigDecimal("0.09");
//        System.out.println(bd3);
//        System.out.println(bd4);
//        //未超出double取值范围,如果传递的是0-10整数,包括0,包括10,那么方法
//        //会返回已经创建好的对象,不会重新new,注意必须是整数
//        //小数底层代码走的是new BigDecimal,整数会调用已创建好的数组
//        BigDecimal bd6 = BigDecimal.valueOf(0.01);
//        System.out.println(bd6);
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        BigDecimal bd3 =bd1.add(bd2);
        System.out.println(bd3);
        double a =0.22;
        Double.toString(a);
        System.out.println(a+"ss");
        BigDecimal bd4= bd1.subtract(bd2);
        BigDecimal bd5= bd1.multiply(bd2);
        System.out.println(bd4);
        System.out.println(bd5);
        BigDecimal bd6 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd6);


    }
}
