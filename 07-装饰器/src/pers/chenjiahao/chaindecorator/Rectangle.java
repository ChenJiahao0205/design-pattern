package pers.chenjiahao.chaindecorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:23
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape Rectangle");
    }
}
