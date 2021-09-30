package pers.chenjiahao.observer.v9;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:21
 */
public class WakeUpEvent extends Event<Child> {
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
