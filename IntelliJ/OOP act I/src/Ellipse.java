import java.util.*;

public class Ellipse extends Shape{
    private double a;
    private double b;
    private final double pi;

    public Ellipse(double a, double b, String color){
        super(color);
        this.pi = 3.14159;
        this.a = a;
        this.b = b;
    }

    @Override
    public double area(){
        return a * b * pi;
    }
    //P ≈ π [ (3/2)(a+b) - √(ab) ]
    @Override
    public double perimeter(){
        return pi*((3.0/2.0)*(a+b) - Math.sqrt(a*b));
    }
    @Override
    public String toString(){
        return super.toString() + " is an Ellipse";
    }

    public static class Circle extends Ellipse{
        private double radius;

        public Circle(double radius, String color){
            super(radius,radius,color);

        }
        @Override
        public String toString(){
            return super.toString() +" is also a Circle";
        }
    }


}
