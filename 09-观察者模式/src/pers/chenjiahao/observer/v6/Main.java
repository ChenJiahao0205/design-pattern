package pers.chenjiahao.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 增加事件类
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
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(),"bed");
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
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }

}

class Mum implements Observer {
    public void hug(){
        System.out.println("mum hugging......");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang(){
        System.out.println("dog wangwangwang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}

interface Observer{
    void actionOnWakeUp(WakeUpEvent event);
}

/**
 * 事件类 发出事件
 */
class WakeUpEvent{
    long timestamp;
    String loc;
    public WakeUpEvent(long timestamp,String loc){
        this.timestamp = timestamp;
        this.loc = loc;
    }
}