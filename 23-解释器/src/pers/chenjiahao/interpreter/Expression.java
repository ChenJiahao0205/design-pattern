package pers.chenjiahao.interpreter;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/27 14:42
 */
public interface Expression {
    boolean interpret(String context);
}