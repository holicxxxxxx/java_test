package day06;

public class day06_task09 {
    public static void main(String[] args) {

    }
    public static int[] copyOf(int[] arr ,int newLength){
        int[] arr1=new int[newLength];
        for (int i = 0; i < newLength; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }

}
