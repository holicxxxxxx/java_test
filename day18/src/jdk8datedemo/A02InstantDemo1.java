package jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02InstantDemo1 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant instant = Instant.ofEpochMilli(0L);//生成毫秒Instant对象
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant2);
        //以上是静态

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));//必须用对象去调用,Instant.now()来生成当前时间对象,前面可以用类名调用
        System.out.println(zonedDateTime);

        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        boolean result = instant4.isBefore(instant3);
        System.out.println(result);
        boolean after = instant4.isAfter(instant3);
        System.out.println(after);
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);
        Instant instant6 = instant5.minusSeconds(1);
        System.out.println(instant6);//因为instant对象不可以修改,所以每次计算以后返回一个新的对象
    }
}
