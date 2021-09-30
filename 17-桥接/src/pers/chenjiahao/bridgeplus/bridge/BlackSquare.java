package pers.chenjiahao.bridgeplus.bridge;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 22:18
 */
public class BlackSquare implements SquareDrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Square[ color: black, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
