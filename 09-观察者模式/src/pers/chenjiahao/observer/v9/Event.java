package pers.chenjiahao.observer.v9;

/**
 * 事件抽象类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:20
 */
public abstract class Event<T> {
    abstract T getSource();
}
