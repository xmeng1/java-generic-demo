/**
 * User:    mengxin
 * Date:    24/05/17
 * Project: java-generic-demo
 */
class AbstractShape<T extends String>{
    private T information;

    AbstractShape(T t) {
        information = t;
        // System.out.print(t);
    }

    void display(){
        System.out.print(this.information + "\n");
    }

    void display(T more){
        System.out.print(more.concat(":"+this.information) + "\n");
    }

}
