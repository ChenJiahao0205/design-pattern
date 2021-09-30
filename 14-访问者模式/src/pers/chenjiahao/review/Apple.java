package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:08
 */
public class Apple extends FruitPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitApple(this);
    }

    @Override
    double getPrice() {
        return 5.00;
    }
}
