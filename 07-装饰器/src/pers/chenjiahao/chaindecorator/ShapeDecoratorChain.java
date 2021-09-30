package pers.chenjiahao.chaindecorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:48
 */
public class ShapeDecoratorChain extends ShapeDecorator {
    List<ShapeDecorator> shapeDecorators = new ArrayList<>();

    public ShapeDecoratorChain(Shape decoratedShape) {
        super(decoratedShape);
    }

    public ShapeDecoratorChain addDecorator(ShapeDecorator shapeDecorator){
        shapeDecorators.add(shapeDecorator);
        return this;
    }

    @Override
    public void draw() {
        super.draw();
        for (ShapeDecorator shapeDecorator : shapeDecorators) {
            shapeDecorator.draw();
        }
    }
}
