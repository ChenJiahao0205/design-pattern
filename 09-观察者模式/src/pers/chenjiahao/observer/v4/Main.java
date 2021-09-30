package pers.chenjiahao.observer.v4;

/**
 * 加入了多个观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child{
    private boolean cry = false;
    private Dad d = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();
    public boolean isCry(){
        return cry;
    }
    public void wakeUp(){
        cry = true;
        d.feed();
        mum.hug();
        dog.wang();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feed................");
    }
}

class Mum{
    public void hug(){
        System.out.println("mum hugging......");
    }
}

class Dog{
    public void wang(){
        System.out.println("dog wangwangwang...");
    }
}
