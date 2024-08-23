
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int n = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int m = Integer.valueOf(scanner.next());
        for(int i =m; i<=n;i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
