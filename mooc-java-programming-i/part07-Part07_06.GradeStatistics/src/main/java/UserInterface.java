

import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start(){
        readInput();
        System.out.println("");
        printGradeDistribution();
    }
   
    public void readInput(){
     
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            if(num >= 0 && num <= 100){
                register.add(new Grade(num));
            }
            
        }
        System.out.println(this.register);
        
    }
    
    public void printGradeDistribution(){
        int grade = 5;
        System.out.println("Grade distribution: ");
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }
    
    
    public void printStars(int stars){
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
        
    }
    
    
    
    
    
    
    
    
}
