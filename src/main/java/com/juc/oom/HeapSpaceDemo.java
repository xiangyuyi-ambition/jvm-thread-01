package com.juc.oom;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 14:13
 * -Xms10m -Xmx10m -XX:+PrintGCDetails
 * java.lang.OutOfMemoryError: Java heap space
 **/
public class HeapSpaceDemo {
    public static void main(String[] args) {
        Byte[] bytes = new Byte[50 * 1024 * 1024];
    }
}
