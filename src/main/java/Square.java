/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
class Square<T extends String> extends AbstractShape<T> {
    Square(T t) {
        super(t);
    }
}
