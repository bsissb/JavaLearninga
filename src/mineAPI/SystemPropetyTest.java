package mineAPI;

/**
 * Created by hp on 2017/4/19.
 */
public class SystemPropetyTest {
    public static void main(String[] args){
        System.out.println("当前系统名:"+System.getProperty("os.name"));
        System.out.println("当前系统版本"+System.getProperty("os.version"));
        System.out.println("当前用户名："+System.getProperty("user.name"));
        System.out.println("用户的主目录"+System.getProperty("user.home"));
        System.out.println("用户的工作目录："+System.getProperty("user.dir"));

        System.out.println("系统环境变量 PATH:\r\n"+System.getenv("PATH"));
        System.out.println("系统环境变量 CLASSPATH:"+System.getenv("CLASSPATH"));
    }
}
