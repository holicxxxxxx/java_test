package algorithm;

public class sort2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
