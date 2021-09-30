package pers.chenjiahao.observer.v10;


import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:22
 */
public class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public Child(String name, List<Observer> observers) {
        this.name = name;
        this.observers = observers;
    }

    private List<Observer> observers = new ArrayList<>();

    public void wakeUp(){
        Event event = new WakeUpEvent(System.currentTimeMillis(),"bed",this);
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
