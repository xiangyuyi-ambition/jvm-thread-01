package com.juc.reference;

import java.lang.ref.WeakReference;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 12:12
 **/
public class WeakReferEnceDemo {
    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> objectWeakReference = new WeakReference<>(object);
        System.out.println(object);
        System.out.println(objectWeakReference.get());

        object = null;
        System.gc();
        System.out.println(object);
        System.out.println(objectWeakReference.get());
    }
}
