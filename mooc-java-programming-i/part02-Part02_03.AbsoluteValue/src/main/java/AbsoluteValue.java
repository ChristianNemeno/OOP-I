
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.next());
        if(n < 0){
            int abs = n * -1;
            System.out.println(abs);
        }else{
            System.out.println(n);
        }
    }
}
