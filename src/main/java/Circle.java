/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
class Circle extends AbstractShape{

    private double r;

    Circle(String s) {
        super(s);
    }

    Circle(String description, int radius) {
        super(description);
        this.r = radius;
    }
}
