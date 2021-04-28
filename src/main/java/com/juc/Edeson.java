package com.juc;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-24 18:25
 * -XX:+PrintGCDetails -XX:SurvivorRatio=4 配置伊甸园区与幸存区比例 4:1:1
 *   eden space 117248K, 6% used [0x0000000715b00000,0x00000007161ded10,0x000000071cd80000)
 *   from space 28672K, 0% used [0x000000071e980000,0x000000071e980000,0x0000000720580000)
 *   to   space 28672K, 0% used [0x000000071cd80000,0x000000071cd80000,0x000000071e980000)
 **/
public class Edeson {
    public static void main(String[] args) {
        System.out.println("edson");
    }
}
