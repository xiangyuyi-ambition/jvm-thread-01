package com.juc.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 13:01
 **/
public class ReferenceQueueDemo {
    public static void main(String[] args) throws Exception {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(object, referenceQueue);
        System.out.println(object);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());

        System.out.println("==============");
        object = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(object);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
    }
}
