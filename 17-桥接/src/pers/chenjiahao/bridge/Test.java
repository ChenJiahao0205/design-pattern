package pers.chenjiahao.bridge;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 21:52
 */
public class Test {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),100,100, 10);
        Shape greenCircle = new Circle(new GreenCircle(),100, 10,100);
        redCircle.draw();
        greenCircle.draw();
    }
}
