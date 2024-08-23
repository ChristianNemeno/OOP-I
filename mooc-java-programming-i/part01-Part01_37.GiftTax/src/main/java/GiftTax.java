
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int n = Integer.valueOf(scan.next());
        //(100 + (6000-5000) * 0.08)
        double tax;
        if(n >= 5000 && n<= 25000){
            tax = (100 + (n-5000) * 0.08);
            System.out.println("Tax: "+tax);
        }else if(n >= 25000 && n<= 55000){
            tax = (1700 + (n-25000) * 0.10);
            System.out.println("Tax: "+tax);
        }else if(n >= 55000 && n<= 200000){
            tax = (4700 + (n-55000) * 0.12);
            System.out.println("Tax: "+tax);
        }else if(n >= 200000 && n<= 1000000){
            tax = (22100 + (n-200000) * 0.15);
            System.out.println("Tax: "+tax);
        }else if(n > 1000000){
            tax = (142100 + (n-1000000) * 0.17); 
            System.out.println("Tax: "+tax);
        }else{
            System.out.println("No tax!");
        }
    }
}

