package com.juc.oom;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 14:05
 **/
public class StackOverFlowDemo {
    public static void main(String[] args) {
        stackOverflow();
    }

    private static void stackOverflow(){
        stackOverflow();
    }
}
