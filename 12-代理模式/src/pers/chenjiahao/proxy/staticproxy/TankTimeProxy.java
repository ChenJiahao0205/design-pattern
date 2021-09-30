package pers.chenjiahao.proxy.staticproxy;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:24
 */
public class TankTimeProxy implements Movable {
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
