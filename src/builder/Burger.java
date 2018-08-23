package builder;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
