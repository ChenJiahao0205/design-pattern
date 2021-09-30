package pers.chenjiahao.mediaadapter;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:38
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
