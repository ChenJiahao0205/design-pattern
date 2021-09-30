package pers.chenjiahao.self.factory;

import pers.chenjiahao.self.handler.FruitHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 20:44
 */
public class FruitStrategyFactory {
    private static Map<String, FruitHandler> fruitStrategyMap = new HashMap<>();

    public static FruitHandler getStrategyMap(String fruitName){
        return fruitStrategyMap.get(fruitName);
    }

    public static void registerHandler(String handlerName, FruitHandler handler){
        fruitStrategyMap.put(handlerName,handler);
    }
}
