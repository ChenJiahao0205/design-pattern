package pers.chenjiahao.mediaadapter;

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
        }else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            //mediaAdapter 提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
