package mineAPI;

/**
 * Created by hp on 2017/4/19.
 */
public class StatusEnumTest {
    public static void main(String[] arg){
        Status account_status = Status.ACTIVE;
        System.out.println("文章状态："+account_status);
        System.out.println("此状态对应的值："+account_status.getValue());

    }
}
