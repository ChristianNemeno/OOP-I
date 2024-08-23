
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.valueOf(scanner.next());
        int i=0;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
