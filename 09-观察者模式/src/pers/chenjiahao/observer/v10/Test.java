package pers.chenjiahao.observer.v10;

import pers.chenjiahao.observer.v10.strategy.AllObserverStrategy;
import pers.chenjiahao.observer.v10.strategy.DadAndDogStrategy;
import pers.chenjiahao.observer.v10.strategy.DadAndMumStrategy;
import pers.chenjiahao.observer.v10.strategy.MumAndDogStrategy;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/11 15:29
 */
public class Test {
    public static void main(String[] args) {
        // 今天爸爸不在家，只有妈妈和狗狗可以作为观察者
        Child child = new Child("五条宝宝",new MumAndDogStrategy().getObserverStrategy());
        child.wakeUp();

        // 今天妈妈不在家，只有爸爸和狗狗可以作为观察者
        Child child1 = new Child("五条宝宝",new DadAndDogStrategy().getObserverStrategy());
        child1.wakeUp();

        // 今天狗狗出去玩了，只有爸爸和妈妈可以作为观察者
        Child child2 = new Child("五条宝宝",new DadAndMumStrategy().getObserverStrategy());
        child2.wakeUp();

        // 今天都在家！！！
        Child child3 = new Child("五条宝宝",new AllObserverStrategy().getObserverStrategy());
        child3.wakeUp();
    }
}
