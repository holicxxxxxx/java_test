package algorithm;

public class sort5 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        getIndex(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    //start end start temp-1 temp+1 end
    public static void getIndex(int[] arr, int STARTDEX, int ENDDEX) {
        int basenum = arr[STARTDEX];
        int startdex = STARTDEX;
        int enddex =ENDDEX;
        int start = startdex;
        int end = enddex;
        //end一定在最前面,确保交换基准数的值比基准数小
        //要有出口!!,前面的循环和后面的两个判断相同的条件可以写成出口,排查了两个小时的死循环!!

        while (start <end) {
            while (true) {
                if (start >= end || arr[end] < basenum) {

                    break;
                } else {
                    end--;
                }
            }
            while (true) {
                if (start >= end || arr[start] > basenum) {
                    break;
                } else {
                    start++;
                }
            }
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

        }
        int temp = arr[start];
        arr[start] = arr[startdex];
        arr[startdex] = temp;

        if (start >1&&start<=end) {
            getIndex(arr, startdex, start - 1);
        }
        if (start < arr.length - 2&&start<=end) {
            getIndex(arr, start + 1, enddex);
        }
    }
}
