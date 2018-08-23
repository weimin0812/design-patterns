package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
