
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ctr=0;
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.next());
            if(n ==0){
                break;
            }
            
            if(n < 0){
                ctr++;
            }
        }
        System.out.println("Number of negative numbers: "+ctr);

    }
}
