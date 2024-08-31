package ui;
import Content.Sheet;
import Content.Student;
import java.util.Scanner;

public class UI {
    private final Scanner scanner;
    private final Sheet s;

    public UI(Scanner scanner, Sheet s) {
        this.scanner = scanner;
        this.s = s;
    }
    int i = 1;
    public void start(){
        while(true){

            System.out.print("Enter choice: (a,p,x,c): " );
            String input = scanner.nextLine();

            switch (input){
                case "a":
                    System.out.print("Enter name: ");
                    String n = scanner.nextLine();

                    s.add(new Student(n, i++));
                    break;

                case "c":
                    System.out.print("What ID?: ");
                    int ID = scanner.nextInt();
                    s.present(ID);
                    String empty = scanner.nextLine();
                    break;

                case "p":
                    s.print();
                    break;

                case "x":
                    System.out.print("Thank you for using");
                    break;

                default:
                    System.out.println("Invalid please try again");
                    break;
            }

            if(input.equals("x")){
                break;
            }
        }
    }
}
