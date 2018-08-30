package template;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // template method

    public final void play() {
        // initialize
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
