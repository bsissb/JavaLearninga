package mineAPI;
import java.util.Arrays;

public class ArraySortAndSearchTest {
    public static void main(String[] args){
        int[] arr = {3,56,6,4,9,39};
        Arrays.sort(arr);//调用排序方法
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,9);
        //从arr数组中搜索指定的9返回索引
        System.out.println("9在arr数组中的索引是："+index);
    }
}
