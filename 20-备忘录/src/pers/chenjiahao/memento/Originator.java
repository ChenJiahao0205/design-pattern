package pers.chenjiahao.memento;

/**
 * Originator 创建并在 Memento 对象中存储状态。
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:54
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
