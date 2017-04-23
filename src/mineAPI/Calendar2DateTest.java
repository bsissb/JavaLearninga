package mineAPI;
import java.util.Calendar;
import java.util.Date;

public class Calendar2DateTest {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        //Calendar转化为Date
        Date date =cal.getTime();

        //date转换成Calendar
        Date day1 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(day1);
    }
}
