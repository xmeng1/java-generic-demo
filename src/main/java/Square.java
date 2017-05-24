/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
class Square<T extends String> extends AbstractShape<T> {

    private double a;

    Square(T t) {
        super(t);
    }

    Square(T t, int a) {
        super(t);
        this.a = a;
    }
}
