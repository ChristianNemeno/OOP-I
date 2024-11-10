package Shapes;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public String toString(){
        return super.toString() + " , which is a Rectangle, Area: " + getArea();
    }

}
