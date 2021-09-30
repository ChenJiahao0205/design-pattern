package pers.chenjiahao.self;

import pers.chenjiahao.self.factory.FruitStrategyFactory;
import pers.chenjiahao.self.handler.AppleHandler;
import pers.chenjiahao.self.handler.BananaHandler;
import pers.chenjiahao.self.handler.OrangeHandler;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 20:22
 */
public class Main {
    public static void main(String[] args) {
        // String fruit = "apple";
        // String fruit = "orange";
        String fruit = "banana";

        // 使用设计模式之前
        if ("apple".equals(fruit)){
            System.out.println("吃到了  Apple ~~~~~~~");
        }else if ("banana".equals(fruit)){
            System.out.println("吃到了  Banana ~~~~~~");
        }else {
            System.out.println("吃到了  Orange ~~~~~~");
        }

        // 使用设计模式之后
        FruitStrategyFactory.getStrategyMap(fruit).eatFruit();

        FruitStrategyFactory.registerHandler("apple",new AppleHandler());
        FruitStrategyFactory.registerHandler("banana",new BananaHandler());
        FruitStrategyFactory.registerHandler("orange",new OrangeHandler());
    }
}
