package pers.chenjiahao.mediator;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:32
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
