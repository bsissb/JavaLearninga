package mineAPI;
import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args){
        System.out.println(formantDecimal("#,###.###",12345.6));
        System.out.println(formantDecimal("000,000.000",12345.6789));
    }
    public static String formantDecimal(String pattern,double number){
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(number);
    }
}
