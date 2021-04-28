package com.juc;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-24 18:49
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:NewRatio=4  NewRatio设置老年代的占比，剩下的1给新生代
 **/
public class NewRatio {
    public static void main(String[] args) {
        System.out.println("New Ratio");
    }
}
