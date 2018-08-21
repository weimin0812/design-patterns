package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
