package mineAPI;
//辣鸡
/**
 * Created by hp on 2017/4/20.
 */
public class WinRARTest {
    private static String rarPath = "D:\\rar\\rar.exe";

    public static void main(String[] args) {
        rar("d:\\qiujy.rar", "d:\\src");
        unRar("d:\\qiujy.rar", "d:\\test");
    }


    public static void rar(String destPath, String srcfolderPath) throws RuntimeException {
        //组装rar压缩命令
        String cmd = rarPath + " a " + destPath + " " + srcfolderPath;
        try {
            Process proc = Runtime.getRuntime().exec(cmd);
            if (proc.waitFor() != 0) {
                System.err.println("执行rar压缩失败，返回码是" + proc.exitValue());
            }
        } catch (Exception e) {
            throw new RuntimeException("执行rar压缩失败", e);
        }
    }

    public static void unRar(String srcPath, String destfolderPath) throws RuntimeException {
        String cmd = rarPath + " x -o+ " + srcPath + " " + destfolderPath;
        try {
            Process proc = Runtime.getRuntime().exec(cmd);
            if (proc.waitFor() != 0) {
                System.err.println("执行rar解压缩操作失败，返回码是" + proc.exitValue());
            }
        } catch (Exception e) {
            throw new RuntimeException("执行rar解压缩失败", e);
        }
    }
}
