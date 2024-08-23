
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //System.out.println(register);
        Scanner scan = new Scanner(System.in);
        GradeRegister regis = new GradeRegister();
        UserInterface UI = new UserInterface(scan, regis);
        
        UI.start();
        
    }
}
