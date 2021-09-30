package pers.chenjiahao.proxy.v06;


import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 * 最简单的办法，修改代码，记录时间
 * 问题2：如果无法改变方法源码呢?
 * v06:将聚合的具体对象改为Movable类型
 * 越来越像decorator了
 * ****************静态代理****************
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
        new TankTimeProxy(
                new TankLogProxy(
                        new Tank()
                )
        ).move();
    }
}

// 一个代理
class TankTimeProxy implements Movable {
    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("移动时间为:" + (end - start) + "毫秒");
    }
}

// 另一个代理
class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("Start moving ....");
        m.move();
        System.out.println("End moving ....");
    }
}

interface Movable{
    void move();
}
