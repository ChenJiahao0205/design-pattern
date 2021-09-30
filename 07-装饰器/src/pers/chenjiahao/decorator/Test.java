package pers.chenjiahao.decorator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/19 21:23
 */
public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        // ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        // ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
