package pers.chenjiahao.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child{
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public void wakeUp(){
        Event event = new WakeUpEvent(System.currentTimeMillis(),"bed",this);
        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

class Dad implements Observer {
    public void feed(){
        System.out.println("dad feed................");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        feed();
    }

}

class Mum implements Observer {
    public void hug(){
        System.out.println("mum hugging......");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang(){
        System.out.println("dog wangwangwang...");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        wang();
    }
}

interface Observer{
    void actionOnWakeUp(Event event);
}

/**
 * 事件类 发出事件
 */
class WakeUpEvent extends Event<Child>{
    long timestamp;
    String loc;
    Child source;
    public WakeUpEvent(long timestamp, String loc, Child source){
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }
}

abstract class Event<T>{
    abstract T getSource();
}