package com.juc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-16 17:06
 **/
public class AtomicReferenceDemo {
    public static void main(String[] args) {
        Person person = new Person("z3",14);
        Person person1 = new Person("li4",25);
        AtomicReference<Person> atomicReference = new AtomicReference();
        atomicReference.set(person);
        System.out.println(atomicReference.compareAndSet(person,person1) + "\t" + atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(person,person1) + "\t" + atomicReference.get().toString());
    }
}

@Getter
@AllArgsConstructor
@ToString
class Person{
     String name;

     int age;
}
