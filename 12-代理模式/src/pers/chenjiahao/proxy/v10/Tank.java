package pers.chenjiahao.proxy.v10;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 * 最简单的办法，修改代码，记录时间
 * 问题2：如果无法改变方法源码呢?
 * v06:将聚合的具体对象改为Movable类型
 * 越来越像decorator了
 * ****************静态代理****************
 *
 * **************开始动态代理**************
 * v07:如果有stop方法需要代理...
 * 如果想让LogProxy可以重用，不仅k可以代理Tank，还可以代理任意其他类型 Object
 * (毕竟日志记录，时间计算是很多方法都需要的东西)，这时该怎么做呢？
 * 本质上：分离代理行为和被代理对象
 * ***************使用jdk的动态代理**************
 * 之前的TimeProxy和LogProxy的代码都看不到了，
 * 悄悄地在运行的时候生成了
 *
 * ---------------------------------------------------
 * 在v8中将v7的匿名内部类改为外部类 好看懂
 * ---------------------------------------------------
 * v9：横切代码与业务逻辑代码分离 AOP
 * v10:通过反射观察生成的代理对象
 *    jdk反射生成代理必须面向接口，这是由于Proxy的内部实现决定的
 */
public class Tank implements Movable {
    /**
     * 模拟坦克移动的一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla....");
        try {
            // 随机睡眠10秒
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        // 将proxy的源码反编译出来
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        // 这个m对象是 proxy 对象 它会调用 动态代理生成的类中的move方法
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeHandler(tank));
        m.move();
        // 这个m对象是 proxy 对象 它会调用 动态代理生成的类中的move方法
        // 这个move方法中调的是这样写的 super.h.invoke(X,X,X)   super就是proxy，h就是TimeHandler，调的就是TimeHandler中的invoke方法
    }
}

class TimeHandler implements InvocationHandler{
    Movable m;

    public TimeHandler(Movable m) {
        this.m = m;
    }

    public void before(){
        System.out.println("method start...");
    }

    public void after(){
        System.out.println("method stop...");
    }

    @Override
    // invoke中的三个参数
    // 1.proxy指的是生成的代理对象(通俗点就是上面的m)
    // 2.method指哪个方法(这样可以用来判断，更加灵活的确定哪个代理中的哪个方法做哪个具体的事情) 这里指的是move方法
    // 3.args值的是参数 可能会有参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(m,args);// 相当于调用了m的move()方法
        after();
        return o;
    }
}

interface Movable{
    void move();
}
