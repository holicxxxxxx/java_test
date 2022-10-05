package jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        String format = dtf1.format(time);
        //EE表示星期,a表示上午
        System.out.println(format);
    }
}
