package pers.chenjiahao.chaindecorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:23
 */
public class Test {
    public static void main(String[] args) {
        Shape shapeDecoratorChain = new ShapeDecoratorChain(new Circle())
                .addDecorator(new RedShapeDecorator())
                .addDecorator(new BlackShapeDecorator());
        System.out.println("\nchain------------------------------");
        shapeDecoratorChain.draw();
    }
}
