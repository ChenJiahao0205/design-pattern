/*
package com.mashibing.cglib;

import java.util.Random;

*/
/**
 * CGLIB缺个包
 *//*

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        // TimeMethodInterceptor 相当于 invocationHandler
        Tank tank = (Tank)enhancer.create();
        tank.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor{
    public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy) throws Throwable{
        // o就是Tank的子类
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before");
        Object result = null;
        result = methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return result;
    }
}

class Tank{
    public void move(){
        System.out.println("Tank moving claclacla....");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/
