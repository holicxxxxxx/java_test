package SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        String str1="2023年11月11日 0:01:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 H:mm:ss");
        Date d1 =sdf1.parse(str1);
        String str2="2023年11月11日 0:0:0";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 H:m:s");
        Date d2 = sdf2.parse(str2);
        String str3="2023年11月11日 0:10:0";
        SimpleDateFormat sdf3 = new SimpleDateFormat("y年MM月dd日 H:mm:s");
        Date d3 = sdf3.parse(str3);
        //三种格式一样!!!!!!!!!!!!!!不区分是否少写一个字母!!只区别中间的间隔符

        if (d1.getTime()>= d2.getTime()&&d1.getTime()<= d3.getTime()){
            System.out.println("秒杀成功!");
        }else{
            System.out.println("秒杀失败!");
        }
    }
}
