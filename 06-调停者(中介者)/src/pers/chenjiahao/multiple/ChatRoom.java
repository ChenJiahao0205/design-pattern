package pers.chenjiahao.multiple;

import java.util.Date;

/**
 * 中介类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:32
 */
public class ChatRoom {
    public static void showMessage(People people, String message){
        System.out.println(new Date().toString() + "[" + people.name + "]：" + message);
    }
}
