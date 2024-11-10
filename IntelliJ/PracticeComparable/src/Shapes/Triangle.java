package Shapes;

public class Triangle extends Shape{

    protected double height;
    protected double base;

    public Triangle(String color, double height, double base){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea(){
        return 0.5 * (base * height);
    }

    @Override
    public String toString(){
        return super.toString() + " which is a Triangle, Area: " + getArea();
    }


}
