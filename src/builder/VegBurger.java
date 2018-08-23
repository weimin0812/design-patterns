package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25;
    }
}
