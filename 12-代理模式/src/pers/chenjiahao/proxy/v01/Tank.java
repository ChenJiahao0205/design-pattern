package pers.chenjiahao.proxy.v01;

import java.util.Random;

/**
 * 问题：想记录坦克的移动时间
 */
public class Tank implements Movable{
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
}

interface Movable{
    void move();
}
