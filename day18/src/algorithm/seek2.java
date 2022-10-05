package algorithm;

import java.sql.SQLOutput;
import java.util.IdentityHashMap;

public abstract class seek2 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};//分块为总数的开根号就可以了(左右)4.5个
//    int[] arr ={16,5,9,12,
//            21,18,
//            32,23,37,26,45,34,
//            50,48,61,52,73,66};//分块为总数的开根号就可以了(左右)4.5个

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] index = new Block[]{b1, b2, b3};

        int num = 26;

        int temp = getIndex1(index,arr,num);
        if(temp ==-1){
            System.out.println("未找到该数");
        }else{
            System.out.println(temp);
        }
    }

    //分块查找




    public static int getIndex(int num, Block[] index, int[] arr) {
        for (int i = 0; i < 3; i++) {
            if (num == index[i].getMax()) {
                return index[i].getMax();
            } else if (num <= index[i].getMax()) {
                int start = index[i].getStartIndex();
                int end = index[i].getEndIndex();
                for (; start <= end; start++) {
                    if (num == arr[start]) {
                        return arr[start];
                    }
                    if (start > end) {
                        return -1;
                    }

                }
            }
        }
        return -1;

    }
    public static int findIndexBlock(Block[] block , int num){
        for (int i = 0; i < block.length; i++) {
            if(num <= block[i].getMax()){
                return i;
            }
        }
        return -1;
    }
    public static int getIndex1(Block[] block,int[] arr,int number){
        int indexBlock = findIndexBlock(block,number);
        if(indexBlock == -1){
            return -1;
        }
        int start = block[indexBlock].getStartIndex();
        int end = block[indexBlock].getEndIndex();
        for (int i = start; i < end; i++) {
            if (arr[i]==number){
                return i;
            }

        }
        return -1;
    }





    //优化分块查找
    //哈希查找

}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

