package pers.chenjiahao.factorymethod;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
        Moveable moveable = new PlaneFactory().create();
        moveable.go();
    }
}