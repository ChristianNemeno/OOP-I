
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give year:");
        int num = Integer.valueOf(scan.next());
        
        if(num % 4 == 0){
            if(num % 100 == 0){
                if(num % 400 == 0){
                    System.out.println("The year is a leap year.");
                    return ;
                    
                }
                System.out.println("The year is not a leap year."); return ;
            }
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
