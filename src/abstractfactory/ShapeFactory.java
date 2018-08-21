package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if ("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }

        return null;
    }
}
