package mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArratList<String> list= new MyArratList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
    }
}
