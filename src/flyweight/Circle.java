package flyweight;

/**
 * @author weimin02
 * @date 2018/9/6
 * @project design-patterns
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle color: " + color + " x: " + x + " y: " + y + " radius: " + radius);
    }
}
