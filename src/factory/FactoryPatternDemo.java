package factory;

/**
 * @author weimin02
 * @date 2018/8/20
 * @project design-patterns
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);

        // call draw method
        circle.draw();

        // get an object of Rectangle
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);

        // call draw method
        rectangle.draw();

        // get an object of Square
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);

        // call draw method
        circle.draw();
    }
}
