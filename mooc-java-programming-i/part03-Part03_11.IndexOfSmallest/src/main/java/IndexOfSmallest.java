
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        while(true){
            int input = Integer.valueOf(scanner.next());
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        // until the user enters 9999
        int smol = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i) < smol){
                smol = list.get(i);
            }
        }
        System.out.println("Smallest number: "+smol);
        
        for(int i=0; i<list.size(); i++){
            if(smol == list.get(i)){
                System.out.println("Found at index: "+i);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
