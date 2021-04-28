package com.juc.reference;

import lombok.Data;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 11:48
 **/
public class StrongReference {
    public static void main(String[] args) throws Exception{
        Object object = new Object();
        Object object1 = object;
        object = null;
        System.gc();
        Thread.sleep(3);
        System.out.println(object1);

        person person = new person();
        person person1 = person;
        System.out.println(person1);
        person.setName("aaa");
        System.out.println(person1);
        person = null;
        System.out.println(person1);

    }

    @Data
    static class person{
        String name ;
    }
}
