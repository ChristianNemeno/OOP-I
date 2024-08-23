
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String ans = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.next());
        System.out.println("Give a double:");
        double dob = Double.valueOf(scan.next());
        System.out.println("Give a boolean:");
        boolean bol = Boolean.valueOf(scan.next());
        
        System.out.println("You gave the string " + ans);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + dob);
        System.out.println("You gave the boolean " + bol);
        // Write your program here

    }
}
