package pers.chenjiahao.commandpluschainfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:33
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public Broker takeOrder(Order order){
        orderList.add(order);
        return this;
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
