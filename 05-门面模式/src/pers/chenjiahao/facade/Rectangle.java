package pers.chenjiahao.facade;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/16 22:03
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画个长方形:Rectangle.draw()");
    }
}
