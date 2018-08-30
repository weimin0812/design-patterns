package strategy;

/**
 * @author weimin02
 * @date 2018/8/30
 * @project design-patterns
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
