
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            // Read the entire line of input
            String line = scanner.nextLine();
            
            // Split the line into words based on spaces
            String[] words = line.split(" ");
            
            // Print each word on a new line
            for (String word : words) {
                System.out.println(word);
            }
        }

    }
}
