package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square draw method");
    }
}
