import Shapes.Square;
import Shapes.Rectangle;
import utils.Math;

public class Driver {

    public static void main(String[] args) {
       Square x = new Square(100);
       System.out.println("Area of the square = " + x.getArea());
       
       Rectangle y = new Rectangle(50, 80);
       System.out.println("Area of the rectangle = " + y.getArea());
       
       System.out.println();
       
       double a = 15.6;
       System.out.println("Factorial of 15.6 = " + Math.factorial((int)a));
       System.out.println("FactorialLoop of 15.6 = " + Math.factorialLoop((int)a));
    }   
}
