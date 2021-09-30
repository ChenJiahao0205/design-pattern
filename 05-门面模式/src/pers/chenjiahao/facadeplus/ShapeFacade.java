package pers.chenjiahao.facadeplus;

/**
 * 管理Shape的门面
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/16 22:12
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

    public ShapeFacade drawCircle(){
        circle.draw();
        return this;
    }

    public ShapeFacade drawRectangle(){
        rectangle.draw();
        return this;
    }

    public ShapeFacade drawSquare(){
        square.draw();
        return this;
    }
}
