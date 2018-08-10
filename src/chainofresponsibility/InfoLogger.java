package chainofresponsibility;

/**
 * @author weimin02
 * @date 2018/8/10
 * @project design-patterns
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info: " + message);
    }
}
