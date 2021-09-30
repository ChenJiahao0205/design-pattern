package pers.chenjiahao.mediaadapterplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/21 17:46
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
    }
}
