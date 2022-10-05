package test_problem;

public class Test3 {
    public static void main(String[] args) {
        int num = 256;
        String str = toBinaryString(num);
        System.out.println(str);
        System.out.println(Integer.toBinaryString(num));


    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int remaindar = number % 2;
            number = number / 2;
            sb.insert(0,remaindar);//插入位置,插入的数
        }
        return sb.reverse().toString();

    }
}
