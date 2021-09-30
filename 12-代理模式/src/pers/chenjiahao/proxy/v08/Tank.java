package pers.chenjiahao.proxy.v08;


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

class LogHandler implements InvocationHandler{
    // 这里先代理坦克类 后面可以代理任何类型
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method" + method.getName() + "start ...");
        Object o = method.invoke(tank,args);
        System.out.println("method" + method.getName() + "end!");
        return o;
    }
}

interface Movable{
    void move();
}
