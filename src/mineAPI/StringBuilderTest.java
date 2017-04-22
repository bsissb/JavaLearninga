package mineAPI;

/**
 * Created by hp on 2017/4/22.
 */
public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("CoreJava");
        sb.append(" Action ");
        sb.append(1.0);
        sb.insert(9,"In");
        String s = sb.toString();
        System.out.println(s);
    }
}
