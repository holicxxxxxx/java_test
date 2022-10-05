package day06;

public class day06_task06 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        equalsArr(arr1,arr2);

    }
    public static void equalsArr(int[] arr1,int[] arr2){
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    System.out.println("不相等");
                    break;
                }
                if(i== arr1.length-1) System.out.println("相等");
            }
        }else System.out.println("不相等");
    }
}
