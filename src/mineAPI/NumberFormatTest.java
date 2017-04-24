package mineAPI;
import java.text.NumberFormat;

public class NumberFormatTest {
    public static void main(String[] args){
        //默认语言环境的数值格式化器
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String str = formatter.format(1234.567);
        System.out.println(str);

        //默认语言环境的百分比格式化器
        NumberFormat formatter2 = NumberFormat.getPercentInstance();
        String str2 = formatter2.format(0.12345);
        System.out.println(str2);

        //默认语言环境的货币格式化器
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance();
        String str3 = formatter3.format(1234.456);
        System.out.println(str3);
    }
}
