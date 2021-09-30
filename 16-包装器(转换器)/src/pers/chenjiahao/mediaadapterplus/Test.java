package pers.chenjiahao.mediaadapterplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:53
 */
public class Test {
    public static void main(String[] args) {
        // 这里模拟Springboot启动后自动注册高级对象到工厂map的操作
        // springboot场景中，可以让AdvancedMediaPlayer接口去继承InitializingBean
        // 这样子类都必须要实现一个方法afterPropertiesSet()，这个方法实在程序之后的时候，默认要执行一次的方法，在这里可以进行一下的注册操作
        // 详见项目：24-eliminate-if-else  文章：利用设计模式优雅的干掉if-else
        AdvancedMediaPlayerFactory.registerAdvancedMedia("mp4",new Mp4Player());
        AdvancedMediaPlayerFactory.registerAdvancedMedia("vlc",new VlcPlayer());

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
