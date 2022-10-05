package jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01ZoneldDemo1 {
    public static void main(String[] args) {
        Set<String> set = ZoneId.getAvailableZoneIds();//static
        System.out.println(set);
        System.out.println(set.size());//600

        ZoneId zoneId = ZoneId.systemDefault();//返回所在时区
        System.out.println(zoneId);

        ZoneId of = ZoneId.of("Africa/Nairobi");
        System.out.println(of);
    }
}
