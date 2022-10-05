package day06;

public class day06_task10 {
    public static void main(String[] args) {

    }
    public static int[] copyOfRange(int[] arr, int from ,int to){
        int[] arr1=new int[to-from];
        for (int i = from; i <=to; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
}
