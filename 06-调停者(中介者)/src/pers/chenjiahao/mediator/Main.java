package pers.chenjiahao.mediator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:39
 */
public class Main {
    public static void main(String[] args) {
        User chen = new User("Jiahao Chen");
        User yang = new User("Qinhang Yang");
        chen.sendMessage("hi yang");
        yang.sendMessage("hi chen");
    }
}
