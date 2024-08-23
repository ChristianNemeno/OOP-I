
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        int m = Integer.valueOf(scanner.next());
        divisibleByThreeInRange(n,m);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int i=beginning; i<=end; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
