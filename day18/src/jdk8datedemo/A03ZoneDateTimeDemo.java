package jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime time1 = ZonedDateTime.of(2077, 10, 1, 11,
                12, 4, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(time2);

        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);


        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);
    }
}
