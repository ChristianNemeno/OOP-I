
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <>();
        while(true){
            int input = Integer.valueOf(scanner.next());
            if(input == -1){
                break;
            }
            list.add(input);
        }
        int sum=0;
        for(int n : list){
            sum+=n;
        }
        
        double average = (double)sum / list.size();
        System.out.println("Average: "+average);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
