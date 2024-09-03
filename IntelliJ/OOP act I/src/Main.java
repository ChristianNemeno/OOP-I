import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;  // Declare a variable of type Rectangle (can hold either Rectangle or Square)
        String color;
        System.out.print("Choose a shape: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "Rectangle":
                // Rectangle case
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the color of the rectangle: ");
                color = scanner.next();

                shape = new Rectangle(length, width, color);
                break;

            case "Square":
                // Square case
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                System.out.print("Enter the color of the square: ");
                color = scanner.next();

                shape = new Rectangle.Square(side, color);
                break;

                //add cases
            case "Circle":
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter the color: ");
                color = scanner.nextLine();

                shape = new Ellipse.Circle(radius, color);
                break;

            case "Ellipse":
                System.out.print("Enter a: ");
                double aE = scanner.nextDouble();
                System.out.print("Enter b: ");
                double bE = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter color: ");
                color = scanner.nextLine();

                shape = new Ellipse(aE,bE,color);

                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Common block of code for both shapes
        if (shape != null) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }

        scanner.close();
    }
}
