package a06entry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class a06mao03 {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");
        map.forEach(( s,  s2)-> System.out.println(s + "=" +s2));

    }
}
