package CalendarDemo;

import java.util.Calendar;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);




        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);//11是12月份,0是1月份
        //c.set(Calendar.MONTH,999);//11是12月份,0是1月份
        c.add(Calendar.MONTH,-1);




//0:纪元 1:年  2:月 3:一年的第几周  4:一个月的第几周  5. 一个月的第几天(几号)
        int year = c.get(Calendar.YEAR);
        int month = c.get(2)+1;
        int date = c.get(5);
        int week =c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+","+month+","+date+","+getweek(week));



    }
    //查表法,让容器对象与索引产生对应关系
    //1对应的是星期日 国际标准
    public static String getweek(int dex){
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[dex];

    }
}
