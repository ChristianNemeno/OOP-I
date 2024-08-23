
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where?");
        int n = Integer.valueOf(scanner.next());
        System.out.println("");
        System.out.print("To where?");
        int m = Integer.valueOf(scanner.next());
        System.out.println("");
        for(int i=n; i<=m; i++){
            System.out.println(numbers.get(i));
        }
    }
}
