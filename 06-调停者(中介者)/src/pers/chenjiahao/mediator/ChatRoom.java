package pers.chenjiahao.mediator;

import java.util.Date;

/**
 * 中介类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:32
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "]：" + message);
    }
}
