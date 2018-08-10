package observer;

/**
 * @author weimin02
 * @date 2018/8/9
 * @project design-patterns
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string " + Integer.toBinaryString(subject.getState()));
    }
}
