package abstractfactory;

/**
 * @author weimin02
 * @date 2018/8/21
 * @project design-patterns
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }

        if ("RED".equalsIgnoreCase(color)){
            return new Red();
        } else if ("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }else if ("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
