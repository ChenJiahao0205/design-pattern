package pers.chenjiahao.decorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:23
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
