public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color){
        super(color);
        this.length =length;
        this.width = width;
    }
    @Override
    public double area(){
        return this.length * this.width;
    }

    public double perimeter(){
        return 2 * length + 2* width;
    }

    @Override
    public String toString(){
        return super.toString() + " and is a Rectangle";
    }

    public static class Square extends Rectangle{

        public Square(double side, String color){
            super(side,side,color);
        }

        @Override
        public String toString(){
            return super.toString() + " and is also a Square";
        }
    }

}


