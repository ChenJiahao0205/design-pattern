package pers.chenjiahao.mediaadapterplus;

import java.util.HashMap;
import java.util.Map;

/**
 * 创造高级实体类的工厂
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 18:25
 */
public class AdvancedMediaPlayerFactory {
    public static Map<String,AdvancedMediaPlayer> advancedMediaFactory = new HashMap<>();

    public static AdvancedMediaPlayer getAdvancedMediaFactory(String advancedMediaType){
        return advancedMediaFactory.get(advancedMediaType);
    }

    public static void registerAdvancedMedia(String advancedMediaType,AdvancedMediaPlayer advancedMediaPlayer){
        // 这里最好先判断一下advancedMediaType和advancedMediaPlayer是否为空或""再进行put
        advancedMediaFactory.put(advancedMediaType,advancedMediaPlayer);
    }
}
