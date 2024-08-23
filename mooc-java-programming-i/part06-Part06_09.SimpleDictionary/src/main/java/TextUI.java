
import java.util.Scanner;
public class TextUI {
    
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scan,SimpleDictionary dict) {
        this.dictionary = dict;
        this.scanner = scan;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation");
                String translate = scanner.nextLine();
                this.dictionary.add(word, translate);
            }else if(command.equals("search")){
                System.out.print("To be translated: ");
                String t = scanner.nextLine();
                if(this.dictionary.contains(t)){
                    String translation = dictionary.translate(t);
                    System.out.println("Translation: "+ translation);
                }else{
                    System.out.println("Word " + t + " was not found");
                }
  
            }else{
                    System.out.println("Unknown command");                
            }
            

        }
    }

    
    
}
