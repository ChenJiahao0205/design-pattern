package pers.chenjiahao.proxy.staticproxy;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/16 23:27
 */
public class Test {
    public static void main(String[] args) {
        new TankTimeProxy(
                new TankLogProxy(
                        new Tank()
                )
        ).move();
    }
}
