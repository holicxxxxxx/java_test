package test_problem;

public class Test2 {
    public static void main(String[] args) {
        String str = "123456789";//先过滤异常数据,剩下的是正常的数据
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据格式有误");
        }else{
            System.out.println("数据格式正确");
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                int temp = str.charAt(i)-'0';
                num = num*10+temp;//Char底层可以自动转换
            }
            System.out.println(num);
        }
    }
}
