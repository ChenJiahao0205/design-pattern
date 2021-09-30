package pers.chenjiahao.handler.factory;

import org.springframework.util.StringUtils;
import pers.chenjiahao.handler.Handler;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂设计模式
 */
public class Factory {
    private static Map<String, Handler> strategyMap = new HashMap<>();

    public static Handler getInvokeStrategy(String name) {
        return strategyMap.get(name);
    }

    public static void register(String name, Handler handler) {
        if (StringUtils.isEmpty(name) || null == handler) {
            return;
        }
        strategyMap.put(name, handler);
    }
}
