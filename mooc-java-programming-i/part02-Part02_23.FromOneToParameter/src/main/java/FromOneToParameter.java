import java.util.Scanner;

public class FromOneToParameter {

    public static void printUntilNumber(int number){
        int i=1;
        while(i<=number){
            System.out.println(i);
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        printUntilNumber(n);
    }
    
}
    
    

