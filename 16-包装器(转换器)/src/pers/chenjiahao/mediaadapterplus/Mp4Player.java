package pers.chenjiahao.mediaadapterplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:38
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playAdvanced(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
