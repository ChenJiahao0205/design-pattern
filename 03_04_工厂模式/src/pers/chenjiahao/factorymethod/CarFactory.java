package pers.chenjiahao.factorymethod;

/**
 * 简单工厂
 */
public class CarFactory {
    public Moveable create(){
        System.out.println("日志操作 ===== a car created!! ");
        return new Car();
    }
}
