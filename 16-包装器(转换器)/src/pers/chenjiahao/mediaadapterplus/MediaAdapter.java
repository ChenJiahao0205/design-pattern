package pers.chenjiahao.mediaadapterplus;

/**
 * 基本媒体的适配器
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:40
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        // 判断一下工厂中是否有这个高级类型
        if (AdvancedMediaPlayerFactory.advancedMediaFactory.containsKey(audioType)){
            advancedMusicPlayer = AdvancedMediaPlayerFactory.advancedMediaFactory.get(audioType);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
            // 真实的场景中，在这里抛出异常，就不会用空的对象去执行play方法了(就不会造成空指针异常了)
            System.exit(0);
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playAdvanced(fileName);
    }
}
