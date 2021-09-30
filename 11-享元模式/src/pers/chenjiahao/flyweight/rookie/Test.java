package pers.chenjiahao.flyweight.rookie;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/13 20:44
 */
public class Test {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(colors[i]);
            circle.draw();
        }
    }
}
