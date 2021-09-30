package pers.chenjiahao.facade;

/**
 * 管理Shape的门面
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/16 22:04
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
