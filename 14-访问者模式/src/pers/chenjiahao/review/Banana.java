package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:08
 */
public class Banana extends FruitPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitBanana(this);
    }

    @Override
    double getPrice() {
        return 15.00;
    }
}
