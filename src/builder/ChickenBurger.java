package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 50.5;
    }
}
