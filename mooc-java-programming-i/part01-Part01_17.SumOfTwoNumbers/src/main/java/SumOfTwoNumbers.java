
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.next());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.next());
        int answer = first + second;
        System.out.println("The sum of the numbers is " + answer);
        // Write your program here

    }
}
