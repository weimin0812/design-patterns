package decorator;

/**
 * @author weimin02
 * @date 2018/8/16
 * @project design-patterns
 */
public abstract class ShapeDecorator implements Shape{
    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
