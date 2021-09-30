package pers.chenjiahao.observer.v9;


import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:22
 */
public class Child {
    private String name;
    private Event event;

    public Child(String name) {
        this.name = name;
    }

    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public void wakeUp(){
        this.event = new WakeUpEvent(System.currentTimeMillis(),"bed",this);
        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + "'}";
    }
}
