public class Triangle extends Shape{
    private double b;
    private double height;
    private double a;
    private double c;


    public Triangle(double a, double height,double b, double c, String color){
        super(color);
        this.a = a;
        this.height = height;
        this.b = b;
        this.c = c;
    }

    public double area(){
        return b*height * 0.5;
    }

    public double perimeter(){
        return a+b+c;
    }

    @Override
    public String toString(){
        return super.toString() + " and is a Triangle";
    }

    public static class EquilateralTriangle extends Triangle{
        //(1/2) * √3 * a
        public EquilateralTriangle(double a, String color){
            super(a, (Math.sqrt(3) * (1.0/2.0) * a),a,a,color);
        }

    }

}
