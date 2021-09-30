package pers.chenjiahao.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        factory.createFood().printName();
        factory.createVehicle().go();
        factory.createWeapon().shoot();

        AbstractFactory magicFactory = new MagicFactory();
        magicFactory.createFood().printName();
        magicFactory.createVehicle().go();
        magicFactory.createWeapon().shoot();
    }
}