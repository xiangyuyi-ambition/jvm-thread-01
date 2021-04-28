package com.juc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-23 10:27
 **/
public class SynchronousQueueDemo {
    public static void main(String[] args) throws Exception {
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

        new Thread(() -> {
            try{
                System.out.println("put a");
                blockingQueue.put("a");
                System.out.println("put b");
                blockingQueue.put("b");
                System.out.println("put c");
                blockingQueue.put("c");
            }catch (Exception e){
                e.printStackTrace();
            }
        },"AAA").start();

        new Thread(() -> {
            try{
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
                TimeUnit.SECONDS.sleep(5);
                System.out.println(blockingQueue.take());
            }catch (Exception e){
                e.printStackTrace();
            }
        },"BBB").start();
    }



}
