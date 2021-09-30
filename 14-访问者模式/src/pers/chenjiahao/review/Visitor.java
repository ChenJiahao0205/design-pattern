package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:07
 */
public interface Visitor {
    void visitBanana(Banana banana);
    void visitApple(Apple apple);
    void visitWatermelon(Watermelon watermelon);
}