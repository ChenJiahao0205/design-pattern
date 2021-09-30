package pers.chenjiahao.flyweight.rookie;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/13 20:41
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x +", y :" + y +", radius :" + radius);
    }
}
