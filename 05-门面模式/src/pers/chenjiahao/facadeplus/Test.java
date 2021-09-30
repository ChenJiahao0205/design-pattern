package pers.chenjiahao.facadeplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/16 22:15
 */
public class Test {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle().drawRectangle().drawSquare();
    }
}
