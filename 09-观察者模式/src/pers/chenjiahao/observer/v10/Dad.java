package pers.chenjiahao.observer.v10;

/**
 * 观察者
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:24
 */
public class Dad implements Observer {
    public void feed(){
        System.out.println("dad feed................");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        WakeUpEvent wakeUpEvent = (WakeUpEvent) event;
        System.out.println("地点:" + wakeUpEvent.loc + ",事件:" + wakeUpEvent.timestamp + ",源对象:" + wakeUpEvent.source);
        feed();
    }
}
