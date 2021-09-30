package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:12
 */
public class PersonalVisitor implements Visitor{
    double totalPrice = 0.0;
    @Override
    public void visitBanana(Banana banana) {
        totalPrice += banana.getPrice();
    }

    @Override
    public void visitApple(Apple apple) {
        totalPrice += apple.getPrice();
    }

    @Override
    public void visitWatermelon(Watermelon watermelon) {
        totalPrice += watermelon.getPrice();
    }
}
