package pers.chenjiahao.review;

/**
 * 水果抽象类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:06
 */
public abstract class FruitPart {
    abstract void accept(Visitor visitor);
    abstract double getPrice();
}
