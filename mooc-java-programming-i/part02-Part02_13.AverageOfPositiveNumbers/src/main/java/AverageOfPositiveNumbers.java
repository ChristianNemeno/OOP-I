
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int ctr=0;
        while(true){
            
            int n = Integer.valueOf(scanner.nextLine());
            if(n ==0){
                break;
            }
            if(n > 0){
                sum+=n;
                ctr++;
            }
        }
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double average = sum/(double)ctr;
            System.out.println(average);
    
        }
        
    }
}
