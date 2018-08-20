package factory;

/**
 * @author weimin02
 * @date 2018/8/20
 * @project design-patterns
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw method");
    }
}
