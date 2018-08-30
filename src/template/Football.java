package template;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football initialize.");
    }

    @Override
    void startPlay() {
        System.out.println("Football start play.");
    }

    @Override
    void endPlay() {
        System.out.println("Football end play.");
    }
}
