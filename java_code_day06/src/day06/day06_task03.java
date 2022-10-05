package day06;

public class day06_task03 {
    public static void main(String[] args) {
        int a=100;
        int b=3349;
        int c=33;
        int mid =a+b+c-getMax(a,b,c)-getMin(a,b,c);
        System.out.print(getMax(a,b,c)+" "+mid+" "+getMin(a,b,c));
    }
    public static int getMax(int a,int b,int c){
            int max=a;
            max=a>b?a:b;
            max=max>c?max:c;
            return max;
        }
    public static int getMin(int a,int b,int c){
        int min =a;
        min=a>b?b:a;
        min=min>c?c:min;
        return min;
    }

}

