package strategy;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
