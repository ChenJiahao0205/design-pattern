package pers.chenjiahao.retrofitfactorymethod;

/**
 * @Author ChenJiahao
 * @Date 2021/7/31 17:44
 */
public class PlaneFactory extends TrafficFactory {
    static {
        trafficFactoryMap.put("PlaneFactory",new PlaneFactory());
    }
    public Moveable create(){
        System.out.println("日志操作 ===== a car created!! ");
        return new Plane();
    }
}
