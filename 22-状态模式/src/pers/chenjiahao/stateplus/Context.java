package pers.chenjiahao.stateplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:26
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
