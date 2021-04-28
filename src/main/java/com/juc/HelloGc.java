package com.juc;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-24 15:00
 *
 *1.jps -l 查看java进程
 * jinfo -flag PrintGCDetails 12008 查看打印GC是否开启 （info -flag 配置项 进程编号 查看打印GC是否开启)
 * or
 * jinfo -flags 17588 (jinfo -flags 进程号）查看所有配置
 *
 * editconfig: -XX:+PrintGCDetails  +表示开启 -表示关闭(布尔型）
 *             -XX:MetaspaceSize=1024m(KV键值对)
 *
 *
 * 2.详细查看
 *
 *   1.java -XX:+PrintFlagsInitial 初始配置
 *   2.java -XX:+PrintFlagsFinal -version  修改过后的配置   := false ：表示被修改过
 *   3.java -XX:+PrintFlagsFinal -Xss128k HelloGc 修改运行参数
 *
 * 3.
 *   java -XX:+PrintCommandLineFlags -version
 **/
public class HelloGc {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello Gc");
        Byte[] bytes = new Byte[50* 1024 * 1024];
    }
}
