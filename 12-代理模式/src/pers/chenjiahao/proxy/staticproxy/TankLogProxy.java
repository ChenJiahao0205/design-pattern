package pers.chenjiahao.proxy.staticproxy;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:24
 */
public class TankLogProxy implements Movable{
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
