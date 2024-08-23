import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String movie = scanner.nextLine();
            if(movie.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int dura = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(movie,dura));
        }
        System.out.print("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.next());
        for(TelevisionProgram brah : programs){
            if(brah.getDuration() <= max){
                System.out.println(brah);
            }
        }
        
    }
}
