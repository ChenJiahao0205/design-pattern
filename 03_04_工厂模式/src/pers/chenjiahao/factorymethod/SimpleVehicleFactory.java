package pers.chenjiahao.factorymethod;

/**
 * 简单工厂
 * 写法简单 可扩展性差!!!
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        // 控制权限之类的操作
        // before processing 前置操作
        return new Car();
    }
    public Broom createBroom(){
        // before processing 前置操作
        return new Broom();
    }
}
