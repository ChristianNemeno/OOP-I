package Shapes;

public class Circle extends Shape{

    protected double radius;
    protected final double pi = 3.14159265;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return pi * radius * radius;

    }

    @Override
    public String toString(){
        return super.toString() + " which is a Circle, Area: " + getArea();
    }
}
