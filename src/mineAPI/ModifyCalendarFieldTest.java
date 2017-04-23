package mineAPI;
import java.util.Calendar;

public class ModifyCalendarFieldTest {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.set(2013,5,3,11,5,5);
        System.out.println(cal.getTime());
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.DAY_OF_WEEK,1);
        System.out.println(cal2.getTime());

        Calendar cal3 = Calendar.getInstance();
        cal3.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(cal3.getTime());
    }
}
