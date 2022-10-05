public class regex_test2 {
    public static void main(String[] args) {
        String s ="小诗诗qwer1234小丹丹qwer1234小惠惠";
        String result=s.replaceAll("[\\w&&[^_]]+","vs");
        String[] arr = s.split("[\\w&&[^_]]+");
        System.out.println(result);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
