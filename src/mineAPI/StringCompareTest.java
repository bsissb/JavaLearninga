package mineAPI;

/**
 * Created by hp on 2017/4/20.
 */
public class StringCompareTest {
    public static void main(String[] args){

        String s1 = "abc中文";
        String s2 = "abc中文";
        String s3 = new String("abc中文");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("------------");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
