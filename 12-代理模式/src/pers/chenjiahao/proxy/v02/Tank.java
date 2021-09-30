package pers.chenjiahao.proxy.v02;

import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 * 最简单的办法，修改代码，记录时间
 * 问题2：如果无法改变方法源码呢?
 */
public class Tank implements Movable {
    /**
     * 模拟坦克移动的一段儿时间
     */
    @Override
    public void move() {
        // 记录开始时间
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclacla....");
        try {
            // 随机睡眠10秒
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("移动时间为:" + (end - start) + "毫秒");
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable{
    void move();
}
