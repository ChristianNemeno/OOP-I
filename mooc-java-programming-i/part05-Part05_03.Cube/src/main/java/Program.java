
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Cube three = new Cube(2);
        System.out.println(three.volume());
                
        System.out.println(three.toString());
        // Experiment with your program here
    }
}
