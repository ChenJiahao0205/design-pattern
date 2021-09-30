package pers.chenjiahao.chaindecorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:31
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator() {
    }

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
