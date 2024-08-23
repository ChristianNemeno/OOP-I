
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. Scanner scan = new Scanner(System.in);
        System.out.println("Password?:");
        String s1 = scan.next();
        
        if(s1.equals("Wattlebird")){
            System.out.println("Off with you!");
        }else{
            System.out.println("Welcome!");
        }
        
        
        // Write your program here 
    }
}
