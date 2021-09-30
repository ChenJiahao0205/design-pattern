package pers.chenjiahao.bridgeplus;

import pers.chenjiahao.bridgeplus.bridge.BlackSquare;
import pers.chenjiahao.bridgeplus.bridge.GreenCircle;
import pers.chenjiahao.bridgeplus.bridge.RedCircle;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 21:52
 */
public class Test {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),100,100, 10);
        // new GreenCircle() 报错
        // Shape greenCircle = new Square(new GreenCircle(),100, 10,100);
        Shape blackSquare = new Square(new BlackSquare(),100, 10,100);
        redCircle.draw();
        blackSquare.draw();
    }
}
