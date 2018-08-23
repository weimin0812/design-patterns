package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 35.0;
    }
}
