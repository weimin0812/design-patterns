package adapter;

/**
 * @author weimin02
 * @date 2018/8/29
 * @project design-patterns
 */
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPalyer advanceMediaPalyer;

    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)){
            advanceMediaPalyer = new VlcPlayer();
        } else if("mp4".equalsIgnoreCase(audioType)){
            advanceMediaPalyer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPalyer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPalyer.playMp4(fileName);
        }

    }
}
