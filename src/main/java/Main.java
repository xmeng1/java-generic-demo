/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
public class Main {

    public static void main(String[] args){
        AbstractShape<String> circle = new Circle("this is circle");
        AbstractShape<String> rectangle = new Rectangle<String>("this is rectangle");
        AbstractShape<String> square = new Square<String>("this is Square");
        circle.display();
        rectangle.display();
        square.display();

        String x = "MoreInfo";
        circle.display(x);
        rectangle.display(x);
        square.display(x);
    }
}
