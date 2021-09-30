package pers.chenjiahao.self.handler;

import org.springframework.stereotype.Component;
import pers.chenjiahao.self.factory.FruitStrategyFactory;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/23 20:49
 */
@Component
public class BananaHandler implements FruitHandler {
    @Override
    public void eatFruit() {
        System.out.println("吃到了  Banana ~~~~~~");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        FruitStrategyFactory.registerHandler("banana",this);
    }
}
