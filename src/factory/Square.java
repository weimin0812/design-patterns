package factory;

/**
 * @author weimin02
 * @date 2018/8/20
 * @project design-patterns
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square draw method");
    }
}
