package jdk8datedemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 00, 00);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);
        System.out.println(duration);//PT198836H10M8.5461962S  小时分钟秒
        System.out.println("---------------------------------------");

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

    }
}
