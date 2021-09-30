package pers.chenjiahao.multiple;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:39
 */
public class Main {
    public static void main(String[] args) {
        new User("Jiahao Chen").sendMessage("hi yang");
        new User("Qinhang Yang").sendMessage("hi chen");
        new Manager("Kun Fang").sendMessage("hi chen、hi yang");
        /*People chen = new User("Jiahao Chen");
        People yang = new User("Qinhang Yang");
        People fang = new Manager("Kun Fang");
        chen.sendMessage("hi yang");
        yang.sendMessage("hi chen");
        fang.sendMessage("hi chen、hi yang");*/
    }
}
