
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.next());
        if(age >= 18){
            System.out.println("You are an adult");
        // Write your program here 
        }else{
            System.out.println("You are not an adult");
        }
    }
}
