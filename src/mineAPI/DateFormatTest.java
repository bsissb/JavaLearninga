package mineAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 * Created by hp on 2017/4/24.
 */
public class DateFormatTest {
    public static void main(String[] args){
        DateFormat formatter = DateFormat.getDateInstance();
        String str = formatter.format(new Date());
        System.out.println("日期"+str);
    }
}
