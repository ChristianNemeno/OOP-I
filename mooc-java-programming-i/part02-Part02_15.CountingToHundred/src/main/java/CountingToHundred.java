
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        
        while(n <= 100){
            System.out.println(n);
            n++;
        }
    }
}
