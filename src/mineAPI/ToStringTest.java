package mineAPI;

/**
 * Created by hp on 2017/4/18.
 */
public class ToStringTest {
    public static void main(String[] arg){
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = obj;
        System.out.println(obj);
        System.out.println(obj2.toString());
        //和System.out.println(obj2)等效
        System.out.println(obj3);
    }
}
