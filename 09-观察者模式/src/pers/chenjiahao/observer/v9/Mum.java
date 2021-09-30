package pers.chenjiahao.observer.v9;

/**
 * 观察者
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:24
 */
public class Mum implements Observer{
    public void hug(){
        System.out.println("mum hugging......");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        WakeUpEvent wakeUpEvent = (WakeUpEvent) event;
        System.out.println("地点:" + wakeUpEvent.loc + ",事件:" + wakeUpEvent.timestamp + ",源对象:" + wakeUpEvent.source);
        hug();
    }
}
