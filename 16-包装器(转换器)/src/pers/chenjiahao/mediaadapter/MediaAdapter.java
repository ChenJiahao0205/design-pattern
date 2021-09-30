package pers.chenjiahao.mediaadapter;

/**
 * 基本媒体的适配器
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:40
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
