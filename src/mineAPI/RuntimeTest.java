package mineAPI;


public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(
                "本JVM可用的CPU的数目：" + runtime.availableProcessors()
        );
        System.out.println(
                "本JVM可用的最大内存量：" + runtime.maxMemory() + "字节"
        );
        System.out.println(
                "本JVM当前使用的内存量：" + runtime.totalMemory() + "字节"
        );
        System.out.println(
                "本JVM当前空闲的内存量：" + runtime.freeMemory() + "字节"
        );
    }
}
