package test_problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        long now = System.currentTimeMillis();
        String birthday = "1998年2月5日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birth = sdf.parse(birthday);
        long birthdayTime = birth.getTime();
        int day=(int)((now-birthdayTime)/3600000/24);
        System.out.println(day);


        LocalDate ld1 = LocalDate.of(1998,2,5);
        LocalDate now1 = LocalDate.now();
        long between = ChronoUnit.DAYS.between(ld1, now1);
        System.out.println(between);
    }
}
