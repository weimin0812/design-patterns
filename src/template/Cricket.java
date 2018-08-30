package template;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket initialize.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket start play.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket end play.");
    }
}
