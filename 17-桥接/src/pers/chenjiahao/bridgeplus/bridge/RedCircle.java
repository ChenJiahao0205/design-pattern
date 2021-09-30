package pers.chenjiahao.bridgeplus.bridge;

/**
 * 实现了DrawAPI接口的实体桥接实现类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 21:47
 */
public class RedCircle implements CircleDrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
