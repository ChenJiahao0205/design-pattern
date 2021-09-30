package pers.chenjiahao.retrofitfactorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/7/31 17:54
 */
public abstract class TrafficFactory {
    static Map<String,TrafficFactory> trafficFactoryMap = new HashMap<>();
    abstract Moveable create();
}
