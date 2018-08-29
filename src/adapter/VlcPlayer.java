package adapter;

/**
 * @author weimin02
 * @date 2018/8/28
 * @project design-patterns
 */
public class VlcPlayer implements AdvanceMediaPalyer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
