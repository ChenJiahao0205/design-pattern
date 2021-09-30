package pers.chenjiahao.chaindecorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:39
 */
public class BlackShapeDecorator extends ShapeDecorator {
    public BlackShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public BlackShapeDecorator() {
    }

    @Override
    public void draw() {
        setBlackBorder(decoratedShape);
    }

    private void setBlackBorder(Shape decoratedShape){
        System.out.println("Border Color: Black");
    }
}
