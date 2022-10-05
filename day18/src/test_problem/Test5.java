package test_problem;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,1);
        c.add(Calendar.DAY_OF_MONTH,-1);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        Calendar c1 = Calendar.getInstance();
        c1.set(2001,0,1);//注意是0而不是1
        c1.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c1.get(Calendar.DAY_OF_YEAR);
        System.out.println(day1);


        LocalDate ld = LocalDate.of(2000, 3, 1);//月份是正常的
        LocalDate ld2 = ld.minusDays(1);//可以写负数,相当于加了一个数
        System.out.println(ld2);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);


        System.out.println(ld.isLeapYear());//可以写完函数以后.sout!!!!!!!!!!
    }
}
