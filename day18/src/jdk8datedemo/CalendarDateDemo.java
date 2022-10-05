package jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class CalendarDateDemo {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println(ldDate);

        int year = ldDate.getYear();
        System.out.println(year);

        Month month = ldDate.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        int month1=ldDate.getMonthValue();
        System.out.println(month1);

        int day = ldDate.getDayOfMonth();
        System.out.println(day);

        int dayOfYear = ldDate.getDayOfYear();
        System.out.println(dayOfYear);

        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        System.out.println(ldDate.isBefore(LocalDate.now()));
        System.out.println(ldDate.isAfter(LocalDate.now()));

        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);//不可修改只能创建

        LocalDate minuslocalDate = ldDate.minusYears(1);
        System.out.println(minuslocalDate);

        LocalDate birDate = LocalDate.of(2000, 1, 1);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(),birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println(birMd.equals(nowMd));

    }
}
