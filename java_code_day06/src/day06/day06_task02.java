package day06;

public class day06_task02 {
    public static void main(String[] args) {
        System.out.println(getMax(999,344,3242));

    }
    public static int getMax(int a,int b,int c){
        int max=0;
        if(a>=b){
            if(a>=c) return a;
            else{
                max=c;
                return max;
            }
        }else {
            if(b>=c) return b;
            else{
                max=c;
                return max;
            }
        }
    }
}
