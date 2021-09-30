package pers.chenjiahao.state.v2;

public class MMSadState extends MMState{

    @Override
    void smile() {
        System.out.println("sad smile");
    }

    @Override
    void cry() {
        System.out.println("sad cry");
    }

    @Override
    void say() {
        System.out.println("sad say");
    }
}
