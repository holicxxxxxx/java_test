package SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) throws ParseException {
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf1.parse(str);
        System.out.println(date);
        System.out.println(date.getTime());
    }

    private static void extracted() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(d1);
        System.out.println(str2);
    }
}
