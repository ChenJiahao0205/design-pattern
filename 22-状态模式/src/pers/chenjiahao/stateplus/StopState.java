package pers.chenjiahao.stateplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:28
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
