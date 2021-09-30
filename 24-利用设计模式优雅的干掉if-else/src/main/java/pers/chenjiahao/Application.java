package pers.chenjiahao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pers.chenjiahao.self.factory.FruitStrategyFactory;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        FruitStrategyFactory.getStrategyMap("apple").eatFruit();
        FruitStrategyFactory.getStrategyMap("banana").eatFruit();
    }

}
