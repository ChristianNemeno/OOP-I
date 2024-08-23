
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.next());
        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.next());
        System.out.println("Give the third number:");
        int n3 = Integer.valueOf(scanner.next());
        int sum = n1+n2+n3;
        double ave = (double)sum / 3;
        System.out.println("The average is "+ave);
        

    }
}
