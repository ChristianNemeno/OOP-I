
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        int num = Integer.valueOf(scanner.next());
        System.out.println(Math.sqrt((n+num)));
    }
}
