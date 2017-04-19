package mineAPI;

/**
 * Created by hp on 2017/4/19.
 */
public class CurrentTimeMillisTest {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println(test());
        long end = System.currentTimeMillis();
        System.out.println("test执行耗时："+(end-start)+"毫秒");
    }
    public static long test(){
        long count = 0;
        for(int i=0;i<10000000;i++){
            count += i;
        }
        return count;
    }
}
