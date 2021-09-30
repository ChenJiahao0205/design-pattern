package pers.chenjiahao.observer.v10.strategy;

import pers.chenjiahao.observer.v10.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者Dad、Mum、Dog
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:50
 */
public class AllObserverStrategy implements ObserverStrategy {
    @Override
    public List<Observer> getObserverStrategy() {
        List<Observer> observers = new ArrayList<>();
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
        return observers;
    }
}
