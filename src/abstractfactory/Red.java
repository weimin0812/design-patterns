package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red");
    }
}
