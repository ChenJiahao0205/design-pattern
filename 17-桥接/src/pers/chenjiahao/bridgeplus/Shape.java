package pers.chenjiahao.bridgeplus;

import pers.chenjiahao.bridgeplus.bridge.DrawAPI;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 21:49
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
