import java.util.Date;
import java.util.Random;

public class time_test1 {
    public static void main(String[] args) {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));//自动提升成long
        Date d2 = new Date(Math.abs(r.nextInt()));//自动提升成long
        long time1=d1.getTime();
        long time2=d2.getTime();


    }

    private static void extracted() {
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);
    }
}
