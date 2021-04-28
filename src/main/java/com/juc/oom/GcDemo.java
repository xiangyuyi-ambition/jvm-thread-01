package com.juc.oom;

import java.util.Random;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 18:27
 *
 * 1.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialGC(DefNew + Tenured)
 * 新生代与老年代均使用Serial
 *
 * 2.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParNewGC (ParNew + Tenured)
 *   Java HotSpot(TM) 64-Bit Server VM warning: Using the ParNew young collector with the Serial old collector
 *   is deprecated and will likely be removed in a future release
 *
 *   通常配合老年代的CMS GC工作
 *
 * 3.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelGC（PSYoungGen + ParOldGen)
 * 不加默认是：-XX:+UseParallelGC  3与4可互相激活
 *
 * 4.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelOldGC （PSYoungGen + ParOldGen)
 *
 * 5.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseConcMarkSweepGC （ParNew + ParOldGen)
 *
 * 6.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialOldGC （已经不用了）
 *
 * 7.-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseG1GC （已经不用了）
 **/
public class GcDemo {
    public static void main(String[] args) {
        Byte[] bytes = new Byte[15 * 1024 * 1024];
    }
}
