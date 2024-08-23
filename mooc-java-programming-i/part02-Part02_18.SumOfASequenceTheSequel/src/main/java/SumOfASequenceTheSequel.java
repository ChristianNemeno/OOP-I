
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int n = Integer.valueOf(scanner.next());
        System.out.println("Last number? ");
        int n2 = Integer.valueOf(scanner.next());
        int sum=0;
        for(int i=n; i<=n2;i++){
            sum += i;
        }
        System.out.println("The sum is "+sum);

    }
}
