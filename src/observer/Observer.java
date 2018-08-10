package observer;

/**
 * @author weimin02
 * @date 2018/8/9
 * @project design-patterns
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
