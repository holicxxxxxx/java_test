package day06;

public class day10_task02 {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        for (int i = 0; i < str1.length(); i++) {
            str1=rotate(str1);
            if(equal(str1,str2)){
                System.out.println(true);
            }
            if(i==str1.length()-1){
                System.out.println(false);
            }
        }

    }
    public static String rotate(String arr1){
        StringBuilder sb=new StringBuilder();
        sb.append(arr1);
        char ch=sb.charAt(0);
        sb.delete(0,1);
        sb.append(ch);
        return sb.toString();
    }
    public static boolean equal(String arr1,String arr2){
        if(arr1.equals(arr2))return true;
        else return false;
    }
}
