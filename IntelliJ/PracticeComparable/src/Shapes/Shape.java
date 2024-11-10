package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString(){
        return "A shape that has a color: " + color;
    }

    @Override
    public int compareTo(Shape that){
        return Double.compare(this.getArea(), that.getArea());
    }

    public static class ColorComparator implements Comparator<Shape>{

        @Override
        public int compare(Shape o1, Shape o2){
            return o1.color.compareTo(o2.color);
        }
    }
}
