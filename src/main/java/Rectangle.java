/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
class Rectangle<T extends String> extends AbstractShape {
    Rectangle(T t) {
        super(t);
    }
}
