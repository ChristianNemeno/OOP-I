
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int ctr=0;
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if(n ==0){
                break;
            }
            ctr++;
            sum+=n;
            
        }
        double average = sum/(double)ctr;
        System.out.println("Average of the numbers: "+average);

    }
}
