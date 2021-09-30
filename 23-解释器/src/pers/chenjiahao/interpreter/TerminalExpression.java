package pers.chenjiahao.interpreter;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/27 16:36
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
