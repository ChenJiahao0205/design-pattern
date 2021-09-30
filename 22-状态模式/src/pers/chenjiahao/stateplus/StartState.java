package pers.chenjiahao.stateplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:27
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
