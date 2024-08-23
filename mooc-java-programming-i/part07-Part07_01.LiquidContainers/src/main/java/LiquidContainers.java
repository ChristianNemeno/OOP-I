
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer=0;
        int secondContainer=0;
        // i have 4 cases
        // case 1 i need to check for negative values
        // case 2 i need to check for over 100 values
        // case 3 i need to 
        System.out.println("First container: 0/100");
        System.out.println("Second container: 0/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] com = input.split(" ");
            if(com[0].equals("add")){
                if(Integer.valueOf(com[1]) < 0){
                    
                }else if(firstContainer + Integer.valueOf(com[1]) > 100){
                    firstContainer = 100;
                }else{
                    firstContainer += Integer.valueOf(com[1]);
                }
            }
            else if(com[0].equals("move")){
                if(Integer.valueOf(com[1]) < 0){
                    
                }else if(secondContainer + Integer.valueOf(com[1]) > 100){
                    secondContainer = 100;
                    if(firstContainer - Integer.valueOf(com[1]) < 0){
                        firstContainer =0;
                    }else{
                        firstContainer -= Integer.valueOf(com[1]);
                    }
                }else if(firstContainer < Integer.valueOf(com[1])){
                    secondContainer = firstContainer;
                    firstContainer = 0;
                }else {
                    firstContainer -= Integer.valueOf(com[1]);
                    secondContainer += Integer.valueOf(com[1]);
                }
                
            }
            else if(com[0].equals("remove")){
                if(Integer.valueOf(com[1]) >= secondContainer){
                    secondContainer = 0;
                }else if(Integer.valueOf(com[1]) < 0){
                    // walay buhaton ok?
                }else{
                    secondContainer -= Integer.valueOf(com[1]);
                }
            }
            System.out.println("");
            System.out.println("First: "+firstContainer+"/"+100);
            System.out.println("Second: "+secondContainer+"/"+100);
        }
    }

}
