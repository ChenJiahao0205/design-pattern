package pers.chenjiahao.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker 对象负责从 Memento 中恢复对象的状态。
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:57
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento mementoState){
        mementoList.add(mementoState);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
