package pers.chenjiahao.stateplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/27 17:29
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
