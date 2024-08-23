
import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner s) {
        this.todo = list;
        this.scan = s;
    }
    public void start(){
        
        while(true){
            String command = scan.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.print("To add: ");
                //String add = scan.nextLine();
                this.todo.add(scan.nextLine());
            
            }else if(command.equals("list")){
                todo.print();
            
            }else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                this.todo.remove(Integer.valueOf(scan.nextLine()));
            
            }
            // end of conditionals
        }
    }
    
}
