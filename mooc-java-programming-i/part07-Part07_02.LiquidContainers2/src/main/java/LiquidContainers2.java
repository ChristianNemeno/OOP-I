
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        Container first = new Container();
        Container second = new Container();
        
        boolean imSmart = false;
        
        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                
                break;
            }
            //flag =true;
            
            String[] com = input.split(" ");
            if(com[0].equals("add")){
                first.add(Integer.valueOf(com[1]));
            }
            
            if(com[0].equals("move")){
                if(Integer.valueOf(com[1]) > first.contains()){
                    int complement = Integer.valueOf(com[1])-first.contains();
                    first.remove(Integer.valueOf(com[1]));
                    second.add(Integer.valueOf(com[1])-complement);
                }else{
                    first.remove(Integer.valueOf(com[1]));
                    second.add(Integer.valueOf(com[1]));
                }
                
            }
            
            if(com[0].equals("remove")){
                second.remove(Integer.valueOf(com[1]));
            }
            
            
        }
        
        
    }

}
