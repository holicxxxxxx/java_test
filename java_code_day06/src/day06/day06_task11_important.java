package day06;

import java.util.Random;

public class day06_task11_important {
    public static void main(String[] args) {
        Random r =new Random();
        int[] arr=new int[]{2,588,888,1000,10000};
        int[] brr=new int[arr.length];
        int count =0;
        while (true){
            for (int i = 0; i < brr.length; ) {
                int index=r.nextInt(arr.length);
                System.out.println(index);
                if(vox(brr,arr[index])){
                    continue;
                }else{
                    brr[count]=arr[index];
                    count++;
                    i++;
                }
            }
            if(count==arr.length) break;
        }
        for (int i = 0; i < brr.length; i++) {

            System.out.println(brr[i]+"元的奖金已被抽出");
        }

    }
    public static boolean vox(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) return true;

        }
        return false;
    }

}
