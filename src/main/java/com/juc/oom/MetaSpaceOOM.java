package com.juc.oom;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: lenrn
 * @description
 * @author: xiangyuyi
 * @create: 2021-04-25 16:33
 * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
 **/
public class MetaSpaceOOM {

    static class OOM{}
    public static void main(final String[] args) {
        int i = 0;
        try{
            while (true){
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOM.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o, args);
                    }
                });
                enhancer.create();
            }
        }catch (Throwable e){
            System.out.println("产生了" + i + "个对象");
            e.printStackTrace();
        }
    }
}
