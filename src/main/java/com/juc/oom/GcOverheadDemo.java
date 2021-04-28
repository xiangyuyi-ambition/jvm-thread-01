package com.juc.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 14:20
 *
 * -Xms20m -Xmx20m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 **/
public class GcOverheadDemo {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while (true){
            try{
                list.add(String.valueOf(i++).intern());
            }catch (Throwable e){
                System.out.println("**************i:" + i);
                e.printStackTrace();
            }
        }
    }
}
