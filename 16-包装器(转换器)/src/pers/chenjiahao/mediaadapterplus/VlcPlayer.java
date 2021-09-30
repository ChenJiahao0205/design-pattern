package pers.chenjiahao.mediaadapterplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:38
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAdvanced(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
