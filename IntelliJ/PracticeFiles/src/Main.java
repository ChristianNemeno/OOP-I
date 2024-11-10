import problem1.FileOperations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String filename = "example.txt";
        String content = "Hello, World!";

        FileOperations.writeToFile(filename, content);
        System.out.println("Content written to " + filename);


        }


    }
