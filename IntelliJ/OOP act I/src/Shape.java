public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public String toString(){
        return "This shape has the color " + color;
    }
}
