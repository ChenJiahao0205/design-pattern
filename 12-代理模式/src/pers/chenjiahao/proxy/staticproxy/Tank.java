package pers.chenjiahao.proxy.staticproxy;

import java.util.Random;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:23
 */
public class Tank implements Movable{
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
