package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle draw method");
    }
}
