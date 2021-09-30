package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:09
 */
public class Fruit{
    private FruitPart banana = new Banana();
    private FruitPart apple = new Apple();
    private FruitPart watermelon = new Watermelon();

    public void accept(Visitor visitor){
        banana.accept(visitor);
        apple.accept(visitor);
        watermelon.accept(visitor);
    }
}
