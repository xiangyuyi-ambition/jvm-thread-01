package com.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-16 11:43
 **/
public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        for(int i=0; i < 20; i++){
            new Thread(() ->{
                for(int j=0; j<1000; j++){
                    myData.addPlus();
                    myData.addAtomic();
                }
            },String.valueOf(i)).start();
        }

        while (Thread.activeCount() > 2){
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + "finally number value" + myData.number);
        System.out.println(Thread.currentThread().getName() + "automic value" + myData.atomicInteger);
    }

    public static void seeOkByVolatile(){
        MyData myData = new MyData();
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try{ TimeUnit.SECONDS.sleep(2); }catch (Exception e){ e.printStackTrace(); }
            myData.addNumber();
            System.out.println(Thread.currentThread().getName() + "\t " + myData.number);
        },"AAA").start();

        while (myData.number == 0){

        }
        System.out.println(Thread.currentThread().getName() + "mission is over,main Thread get number " + myData.number);
    }
}


class MyData{
    volatile int number =0 ;

    public void addNumber(){
        number += 60;
    }

    public void addPlus(){
        number ++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }

}
