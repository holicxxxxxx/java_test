package jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A10_ChronoUnitDemo_imp {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birth = LocalDateTime.of(2000,1,1,0,0,0);
        System.out.println(birth);

        System.out.println("相差的年数"+ ChronoUnit.YEARS.between(birth,today));
        System.out.println("相差的月份"+ChronoUnit.MONTHS.between(birth,today));
        System.out.println("相差的周数"+ChronoUnit.WEEKS.between(birth,today));
        System.out.println("相差的天数"+ChronoUnit.DAYS.between(birth,today));
        System.out.println("相差的时数"+ChronoUnit.HOURS.between(birth,today));
        System.out.println("相差的分数"+ChronoUnit.MINUTES.between(birth,today));
        System.out.println("相差的秒数"+ChronoUnit.SECONDS.between(birth,today));
        System.out.println("相差的毫秒数"+ChronoUnit.MILLIS.between(birth,today));
        System.out.println("相差的微秒数"+ChronoUnit.MICROS.between(birth,today));
        System.out.println("相差的纳秒数"+ChronoUnit.NANOS.between(birth,today));
        System.out.println("相差的半天数"+ChronoUnit.HALF_DAYS.between(birth,today));
        System.out.println("相差的十年数"+ChronoUnit.DECADES.between(birth,today));
        System.out.println("相差的世纪数"+ChronoUnit.CENTURIES.between(birth,today));
        System.out.println("相差的千年数"+ChronoUnit.MILLENNIA.between(birth,today));
        System.out.println("相差的纪元数"+ChronoUnit.ERAS.between(birth,today));
    }
}
