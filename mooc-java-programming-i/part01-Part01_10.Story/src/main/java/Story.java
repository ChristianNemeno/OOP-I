
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mes = scanner.nextLine();
        System.out.println("What is their job?");
        String mes1 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + mes + ", who was " + mes1 +".");
        System.out.println("On the way to work, " +mes+" reflected on life.");
        System.out.println("Perhaps " + mes + " will not be " + mes1 + " forever.");
        // Write your program here

    }
}
