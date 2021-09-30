package pers.chenjiahao.bridge;

/**
 * 实现了 Shape 抽象类的实体类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 21:50
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
