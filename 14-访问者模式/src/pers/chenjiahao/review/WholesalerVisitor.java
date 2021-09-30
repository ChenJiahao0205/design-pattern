package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:12
 */
public class WholesalerVisitor implements Visitor{
    double totalPrice = 0.0;
    @Override
    public void visitBanana(Banana banana) {
        totalPrice += banana.getPrice() * 0.7;
    }

    @Override
    public void visitApple(Apple apple) {
        totalPrice += apple.getPrice() * 0.7;
    }

    @Override
    public void visitWatermelon(Watermelon watermelon) {
        totalPrice += watermelon.getPrice() * 0.7;
    }
}
