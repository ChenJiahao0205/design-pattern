package pers.chenjiahao.state.v2;

public class Main {
    public static void main(String[] args) {
        MM mm = new MM();
        mm.state = new MMHappyState();
        mm.say();
        mm.cry();
        mm.smile();

        System.out.println("--------------------------");

        MM mm1 = new MM();
        mm1.state = new MMSadState();
        mm1.cry();
        mm1.smile();
        mm1.say();

        System.out.println("--------------------------");

        /*MM mm2 = new MM();
        mm2.state = new MMSadState();
        mm2.state.doSome();*/
        /*new MMSadState().doSome();*/
    }
}
