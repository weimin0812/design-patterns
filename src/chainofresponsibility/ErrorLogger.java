package chainofresponsibility;

/**
 * @author weimin02
 * @date 2018/8/10
 * @project design-patterns
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
