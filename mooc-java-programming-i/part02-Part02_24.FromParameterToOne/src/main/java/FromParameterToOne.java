
import java.util.Scanner;
public class FromParameterToOne {

    public static void printFromNumberToOne(int n){
        while(n > 0){
            System.out.println(n);
            n--;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        printFromNumberToOne(n);
    }

}
