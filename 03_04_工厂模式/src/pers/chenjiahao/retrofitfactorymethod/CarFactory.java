package pers.chenjiahao.retrofitfactorymethod;

/**
 * 简单工厂
 */
public class CarFactory extends TrafficFactory{
    static {
        trafficFactoryMap.put("CarFactory",new CarFactory());
    }
    public Moveable create(){
        System.out.println("日志操作 ===== a car created!! ");
        return new Car();
    }
}
