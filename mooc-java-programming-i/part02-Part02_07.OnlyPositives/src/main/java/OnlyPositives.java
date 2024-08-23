
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.next());
            if(n < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            if(n > 0){
                System.out.println(n*n);
                continue;
            }
            
            if(n == 0){
                break;
            }
            
        }
    }
}
