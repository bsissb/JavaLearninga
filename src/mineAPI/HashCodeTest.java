package mineAPI;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by hp on 2017/4/18.
 */
public class HashCodeTest {
    public static void main(String[] arg){
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = obj;
        System.out.println("obj.hashCode()="+obj.hashCode());
        System.out.println("obj2.hashCode()="+obj.hashCode());
        System.out.println("obj3.hashCode()="+obj.hashCode());
    }
}
