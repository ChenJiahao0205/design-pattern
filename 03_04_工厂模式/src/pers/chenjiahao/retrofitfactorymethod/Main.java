package pers.chenjiahao.retrofitfactorymethod;

public class Main {
    static{
        TrafficFactory.trafficFactoryMap.put("PlaneFactory",new PlaneFactory());
        TrafficFactory.trafficFactoryMap.put("CarFactory",new CarFactory());
    }
    public static void main(String[] args) {
        Moveable m = TrafficFactory.trafficFactoryMap.get("PlaneFactory").create();
        m.go();
    }
}