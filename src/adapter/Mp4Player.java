package adapter;

/**
 * @author weimin02
 * @date 2018/8/28
 * @project design-patterns
 */
public class Mp4Player implements AdvanceMediaPalyer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file: " + fileName);
    }
}
