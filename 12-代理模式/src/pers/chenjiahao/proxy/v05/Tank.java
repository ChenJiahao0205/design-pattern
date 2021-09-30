package pers.chenjiahao.proxy.v05;


import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 * 最简单的办法，修改代码，记录时间
 * 问题2：如果无法改变方法源码呢?
 * v5:代理有各种类型
 * 问题：如何实现代理的哥哥组合？继承？Decorator？
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
        new TankTimeProxy().move();
    }
}

// 一个代理
class TankTimeProxy implements Movable {
    // 聚合了一个坦克
    Tank tank;
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("移动时间为:" + (end - start) + "毫秒");
    }
}

// 另一个代理
class TankLogProxy implements Movable{
    Tank tank;

    @Override
    public void move() {
        System.out.println("Start moving ....");
        tank.move();
        System.out.println("End moving ....");
    }
}

interface Movable{
    void move();
}
