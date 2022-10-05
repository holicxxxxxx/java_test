package integerdemo;

public class IntegerDemo4 {
    public static void main(String[] args) {
        String str1 =Integer.toBinaryString(100);
        System.out.println(str1);

        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        String str3 = Integer.toHexString(100);
        System.out.println(str3);
        //将字符串类型的整数转成int类型的整数
        //强类型语言:每种数据在java中有各自的数据类型
        //不是同一种数据类型无法直接计算
        int i = Integer.parseInt("123");
        System.out.println(i);
    }
}
