package pers.chenjiahao.strategy.comparaotr;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 16:54
 */
public class Cat {
    int weight;
    int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
