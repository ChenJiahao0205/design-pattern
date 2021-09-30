package pers.chenjiahao.state.v2;

public class MMHappyState extends MMState {

    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {
        System.out.println("happy cry");
    }

    @Override
    void say() {
        System.out.println("happy say");
    }
}
