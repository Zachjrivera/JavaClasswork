package shapes;

public class Main {
    public static void main(String[] args) {

        Shapes triangle = new Triangle(3,10,12);
        Shapes rectangle = new Rectangle(4,10,12);

//        System.out.println(triangle.calculateArea());
//        System.out.println(rectangle.calculateArea());


        Shapes [] shapes  = {triangle,rectangle};

        for ( Shapes s :shapes) {
           s.calculateArea();
        }





        //======================================================================
    }
}
