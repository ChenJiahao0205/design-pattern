package pers.chenjiahao.commandpluschainfactory.factory;

import pers.chenjiahao.commandpluschainfactory.handler.OperateHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 库存操作工厂
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 21:19
 */
public class StockOperateFactory {
    private static Map<String, OperateHandler> operateStockHandlerList = new HashMap<>();

    public static OperateHandler getOperateStockHandlerList(String operateName){
        return operateStockHandlerList.get(operateName);
    }

    public static void registerOperateStockHandler(String operateName,OperateHandler operateHandler){
        operateStockHandlerList.put(operateName,operateHandler);
    }
}
