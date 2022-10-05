package jdk8datedemo;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDate = LocalDate.of(2000,1,1);
        System.out.println(birthDate);

        Period period = Period.between(birthDate,today);//第二个参数减第一个参数
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());
    }
}
