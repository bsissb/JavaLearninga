package mineAPI;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;
public class GetCalendarFieldTest {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println("年："+cal.get(Calendar.YEAR));
        System.out.println("月："+cal.get(Calendar.MONTH));
        System.out.println("day:"+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("星期："+(cal.get(Calendar.DAY_OF_WEEK)-1));
        System.out.println("时："+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+cal.get(Calendar.MINUTE));
        System.out.println("秒："+cal.get(Calendar.SECOND));
    }
}
