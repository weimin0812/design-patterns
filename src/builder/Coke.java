package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 30.0;
    }
}
