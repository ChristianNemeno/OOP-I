
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = Integer.valueOf(scanner.next());
        int fact =1;
        for(int i = n; i>=1; i--){
            fact *= i;;
        }
        System.out.println("Factorial: "+fact);
    }
}
