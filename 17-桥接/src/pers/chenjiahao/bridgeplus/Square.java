package pers.chenjiahao.bridgeplus;

import pers.chenjiahao.bridgeplus.bridge.SquareDrawAPI;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 22:20
 */
public class Square extends Shape{
    private int x, y, radius;

    public Square(SquareDrawAPI drawAPI, int x, int y, int radius) {
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
