package pers.chenjiahao.commandpluschainfactory;

import pers.chenjiahao.commandpluschainfactory.factory.StockOperateFactory;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:23
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void operateStock(String operateName){
        StockOperateFactory.getOperateStockHandlerList(operateName).operateStock(name,quantity);
    }
}
