import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/hello.txt"));
            System.out.println("SUCCESS");
            System.out.println(br.readLine());
        }catch(FileNotFoundException e ){
                System.out.println("check again");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}