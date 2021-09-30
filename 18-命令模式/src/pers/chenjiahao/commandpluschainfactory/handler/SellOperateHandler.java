package pers.chenjiahao.commandpluschainfactory.handler;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 21:24
 */
public class SellOperateHandler implements OperateHandler {
    @Override
    public void operateStock(String name, int quantity) {
        System.out.println("Stock [ Name:" + name + "Quantity:" + quantity + "] sold");
    }
}
