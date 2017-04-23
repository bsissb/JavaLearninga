package mineAPI;

public class EqualsTest {
    public static void main(String[] arg) {
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = obj;
        System.out.println("obj.equals(obj2)=" + obj.equals(obj2));
        System.out.println("obj.equals(obj3)="+obj.equals(obj3));
    }
}
