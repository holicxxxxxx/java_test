import java.util.Date;

public class time_test {
    public static void main(String[] args) {
        Date d =new Date();
        System.out.println(d);
        Date d2 = new Date(0L);
        System.out.println(d2);
        d2.setTime(1000L);//返回long型
        System.out.println(d2);
        long time = d2.getTime();//getTime
        System.out.println(time);

    }

}
