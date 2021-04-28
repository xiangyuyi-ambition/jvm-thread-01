package com.juc;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-16 19:48
 **/
public class SpinLockDemp {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public static void main(String[] args) throws Exception {
        //原子引用线程
        SpinLockDemp spinLockDemp = new SpinLockDemp();

        new Thread(() ->{
            spinLockDemp.lock();
            try{
                TimeUnit.SECONDS.sleep(3);
            }catch (Exception e){
                e.printStackTrace();
            }
            spinLockDemp.unLock();
        },"AA").start();

        Thread.sleep(1000);
        new Thread(() ->{
            spinLockDemp.lock();
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            spinLockDemp.unLock();
        },"BB").start();

    }

        public void lock(){
            while (!atomicReference.compareAndSet(null, Thread.currentThread())){
            }
            System.out.println(Thread.currentThread().getName() + "lock");
        }

        public void unLock(){
            while (atomicReference.compareAndSet(Thread.currentThread(), null)){

            }
            System.out.println(Thread.currentThread().getName() + "unlock");
        }


}
