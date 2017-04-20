package mineAPI;

/**
 * Created by hp on 2017/4/20.
 */
public class StringValueOfTest {
    public static void main(String[] args){
        String str = String.valueOf(123456);
        String str2 = String.valueOf(new Object());
        System.out.println(str);
        System.out.println(str2);
    }
}
