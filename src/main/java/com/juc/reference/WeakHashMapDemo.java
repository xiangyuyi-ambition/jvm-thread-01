package com.juc.reference;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;


/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 12:31
 **/
public class WeakHashMapDemo {
    public static void main(String[] args) {
        hashmap();
        weakHashmap();
    }

    private static void hashmap(){
        Map<Integer,String> map = new HashMap<>();
        Integer integer = new Integer(1);
        String value = "HashMap";
        map.put(integer, value);
        System.out.println(map);
        integer = null;
        System.out.println(map);
        System.gc();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println("=====================");

    }

    private static void weakHashmap(){
        Map<Integer,String> map = new WeakHashMap<>();
        Integer integer = new Integer(2);
        String value = "HashMap";
        map.put(integer, value);
        System.out.println(map);
        integer = null;
        System.out.println(map);
        System.gc();
        System.out.println(map);
        System.out.println(map.size());

    }
}
