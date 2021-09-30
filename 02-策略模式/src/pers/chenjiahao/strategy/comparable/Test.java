package pers.chenjiahao.strategy.comparable;

/**
 * 使用comparable
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 16:58
 */
public class Test {
    public static void main(String[] args) {
        // 使用Comparable比较两只猫
        Cat cat = new Cat(15, 15);
        Cat cat1 = new Cat(16, 16);
        int retValue = cat.compareTo(cat1);
        System.out.println(retValue);

        // 使用Comparable比较两只狗
        Dog dog = new Dog(15);
        Dog dog1 = new Dog(16);
        int retValue1 = dog.compareTo(dog1);
        System.out.println(retValue1);
    }
}
