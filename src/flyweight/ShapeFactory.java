package flyweight;

import java.util.HashMap;

/**
 * @author weimin02
 * @date 2018/9/6
 * @project design-patterns
 */
public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
