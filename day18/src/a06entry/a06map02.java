package a06entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a06map02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");
        //第一种遍历方式

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }

//        Iterator<String> it =new Iterable();
//        Iterator<Integer> it = ts.iterator();


        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        Iterator<Map.Entry<String,String>> it2 = entries.iterator();
        while (it2.hasNext()){
            Map.Entry<String, String> e = it2.next();
            String key1 = e.getKey();
            String value1 = e.getValue();
            System.out.println(key1 + "=" + value1);
        }
        entries.forEach(stringStringEntry-> System.out.println(stringStringEntry.getKey()+"="+stringStringEntry.getValue()));

    }
}
