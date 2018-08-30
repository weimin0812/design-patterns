package template;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
