package decorator;

/**
 * @author weimin02
 * @date 2018/8/16
 * @project design-patterns
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
