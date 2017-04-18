package mineAPI;

/**
 * Created by hp on 2017/4/18.
 */
public class EnumTest {
    public static void main(String[] arg){
        Year my2013 = Year.SPRING; //使用枚举类型定义变量和赋初值
        Year[] ys = Year.values(); //获取Color枚举类型的所有枚举值的数组
        for (Year y:ys){
            System.out.println(y);
        }
        Year your2013 = Year.valueOf("AUTUMN");
        switch(your2013){ //枚举类型可用于switch判断，因为本质上枚举值是int值
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            default:
                System.out.println("冬天");
        }
    }
}
