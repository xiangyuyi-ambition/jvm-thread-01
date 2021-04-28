package com.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-16 15:25
 **/
public class CasDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2019) + "\t current data" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2019) + "\t current data" + atomicInteger.get());
        atomicInteger.getAndIncrement();
    }
}
