package mineAPI;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args){
        int[] arr = {3,56,6,4,9,39};
        System.out.println("原数组的内容"+Arrays.toString(arr));
        int[] dest = Arrays.copyOf(arr,10);
        System.out.println("新数组的内容"+Arrays.toString(dest));
    }
}
