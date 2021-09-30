package pers.chenjiahao.commandpluschainfactory;

import pers.chenjiahao.commandpluschainfactory.factory.StockOperateFactory;
import pers.chenjiahao.commandpluschainfactory.handler.BuyOperateHandler;
import pers.chenjiahao.commandpluschainfactory.handler.SellOperateHandler;

/**
 * 链式调用+工厂+策略
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:35
 */
public class Test {
    public static void main(String[] args) {
        Broker broker = new Broker();
        // 向工厂map中手动注册操作handler(这里注册的操作在Springboot项目中可以让操作接口去继承InitializingBean，子类在afterPropertiesSet()中进行自动注册)
        StockOperateFactory.registerOperateStockHandler("buy",new BuyOperateHandler());
        StockOperateFactory.registerOperateStockHandler("sell",new SellOperateHandler());
        // 修改为链式添加
        broker.takeOrder(new BuyStockOrder(new Stock()))
              .takeOrder(new SellStockOrder(new Stock()));
        broker.placeOrders();
    }
}
