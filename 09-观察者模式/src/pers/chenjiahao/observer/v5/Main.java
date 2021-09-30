package pers.chenjiahao.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * 分离观察者和被观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child{
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }
}

class Dad implements Observer{
    public void feed(){
        System.out.println("dad feed................");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }

}

class Mum implements Observer{
    public void hug(){
        System.out.println("mum hugging......");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}

class Dog implements Observer{
    public void wang(){
        System.out.println("dog wangwangwang...");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }
}

interface Observer{
    void actionOnWakeUp();
}
