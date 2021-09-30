package pers.chenjiahao.proxy.dynamicagentplus;

import java.lang.reflect.Proxy;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:27
 */
public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        // 这里用到了反射，反射就是不用看到源码，就可以知道有哪些属性和方法
        // newProxyInstance()会返回一个代理对象
        // 关于其中的三个参数
        // 第一个参:(跟被代理对象用同一个就好)用哪个Classloader来把将来返回来的代理对象漏到内存
        // 第二个参:(被new出来的对象要实现这个接口)代理对象应该实现哪些接口
        // 第三个参：调用处理器 其实就是实现了InvocationHandler的对象
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class}, // tank.class.getInterfaces()
                new LogHandler(tank));
        m.move();
    }
}
