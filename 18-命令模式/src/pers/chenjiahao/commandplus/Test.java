package pers.chenjiahao.commandplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:35
 */
public class Test {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStockOrder(new Stock()));
        broker.takeOrder(new SellStockOrder(new Stock()));
        broker.placeOrders();
    }
}
