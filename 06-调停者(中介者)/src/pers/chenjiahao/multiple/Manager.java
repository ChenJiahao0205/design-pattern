package pers.chenjiahao.multiple;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/18 21:45
 */
public class Manager extends People{

    public Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
