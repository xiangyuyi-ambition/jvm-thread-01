package com.juc.oom;

import java.nio.ByteBuffer;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 14:41
 * -Xms20m -Xmx20m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 * MaxDirectMemorySize : 最大堆内存
 * java.lang.OutOfMemoryError: Direct buffer memory
 **/
public class DirectBufferDemo {
    public static void main(String[] args) {
        System.out.println("MaxDirectMemory" + sun.misc.VM.maxDirectMemory()/(1024 * 1024) + "MB");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
