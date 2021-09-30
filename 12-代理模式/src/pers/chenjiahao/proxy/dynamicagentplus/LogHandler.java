package pers.chenjiahao.proxy.dynamicagentplus;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:24
 */
public class LogHandler implements InvocationHandler {
    Movable movable;

    public LogHandler(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object o = method.invoke(movable,args);
        after(method);
        return o;
    }

    private void after(Method method) {
        System.out.println("method" + method.getName() + "end!");
    }

    private void before(Method method) {
        System.out.println("method" + method.getName() + "start ...");
    }
}
