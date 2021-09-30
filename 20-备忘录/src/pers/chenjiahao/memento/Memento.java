package pers.chenjiahao.memento;

/**
 * Memento 包含了要被恢复的对象的状态。
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:53
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
