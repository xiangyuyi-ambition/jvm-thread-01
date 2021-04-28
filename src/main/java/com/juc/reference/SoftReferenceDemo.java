package com.juc.reference;

import java.lang.ref.SoftReference;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 11:53
 **/
public class SoftReferenceDemo {

    /**
     * 内存够用就保留，不够用就回收
     */
    public static void softReference_Memory_Enough() throws Exception{
        Object object = new Object();
        SoftReference<Object> softReference = new SoftReference(object);
        System.out.println(object);
        System.out.println(softReference.get());
        object = null;
        System.gc();
        Thread.sleep(3);
        System.out.println(object);
        System.out.println(softReference.get());
    }

    public static void softReference_Memory_NotEnough() throws Exception{
        Object object = new Object();
        SoftReference<Object> softReference = new SoftReference(object);
        System.out.println(object);
        System.out.println(softReference.get());
        object = null;
        try {
            Byte[] bytes = new Byte[50* 1024 * 1024];
        }catch (Exception e){

        }finally {
            System.out.println(object);
            System.out.println(softReference.get());
        }
    }

    public static void main(String[] args)throws Exception {
        //softReference_Memory_Enough();
        softReference_Memory_NotEnough();
    }
}
