package a06entry;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class a06map {
    public static void main(String[] args) {
        Map<String,String> m =new HashMap<>();
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("杨过", "小龙女");
        //put即可以用来添加,如果键不存在,则返回null,如果键存在,会把原来数据覆盖,并且返回被覆盖的值
        //String value = m.put("韦小宝", "双儿");
        //System.out.println(value);

        String value = m.remove("郭靖");
        System.out.println(value);//返回被删除值本身

//        m.clear();//无返回值
        boolean keyresult = m.containsKey("郭靖");
        System.out.println(keyresult);


        boolean valueresult = m.containsValue("小龙女");
        System.out.println(valueresult);

        int size = m.size();
        System.out.println(size);

        System.out.println(m);

    }
}
