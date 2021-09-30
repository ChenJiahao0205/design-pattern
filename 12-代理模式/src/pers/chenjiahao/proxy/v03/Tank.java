package pers.chenjiahao.proxy.v03;

import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 * 最简单的办法，修改代码，记录时间
 * 问题2：如果无法改变方法源码呢?
 * 用继承？
 *  可以 但是慎用 耦合度太高
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
        new Tank2().move();
    }
}

/**
 * 再记录别的 还得再写Tank3 Tank4 Tank5
 */
class Tank2 extends Tank{
    @Override
    public void move() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        super.move();
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("移动时间为:" + (end - start) + "毫秒");
    }
}

interface Movable{
    void move();
}
