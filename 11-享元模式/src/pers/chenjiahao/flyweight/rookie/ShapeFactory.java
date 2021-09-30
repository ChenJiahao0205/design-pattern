package pers.chenjiahao.flyweight.rookie;

import java.util.HashMap;
import java.util.Map;

/**
 * circleMap属性就是池的概念
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/13 20:43
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color,10,20,30);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
