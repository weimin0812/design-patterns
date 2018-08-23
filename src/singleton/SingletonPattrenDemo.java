package singleton;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class SingletonPattrenDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
