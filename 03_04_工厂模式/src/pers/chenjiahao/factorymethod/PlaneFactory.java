package pers.chenjiahao.factorymethod;

/**
 * @Author ChenJiahao
 * @Date 2021/7/31 17:44
 */
public class PlaneFactory {
    public Moveable create(){
        System.out.println("日志操作 ===== a car created!! ");
        return new Plane();
    }
}
