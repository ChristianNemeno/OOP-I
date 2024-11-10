package Shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeSorter {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Create instances of different shapes
        shapes.add(new Circle(5 , "red"));    // Area ≈ 78.54
        shapes.add(new Rectangle("blue",5, 10)); // Area = 50
        shapes.add(new Triangle("violet",6, 8));   // Area = 24
        shapes.add(new Circle(3,"green"));    // Area ≈ 28.27
        shapes.add(new Rectangle("white",4, 4)); // Area = 16

        // Print unsorted shapes
        System.out.println("Unsorted shapes:");
        printShapes(shapes);

        // Sort the shapes
        Collections.sort(shapes, new Shape.ColorComparator());

        // Print sorted shapes
        System.out.println("\nSorted shapes:");
        printShapes(shapes);
    }

    private static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    }


