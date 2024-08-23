
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<archive> arcs = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }            
            System.out.println("Name? (empty will stop)");
            String n = scanner.nextLine();
            if(n.isEmpty()){
                break;
            }
            archive temp = new archive(id, n); 
            
            boolean flag = true;
            for(archive libro : arcs){
                if(libro.equals(temp)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arcs.add(temp);
            }

        }
        System.out.println("==Items==");
        for(archive v : arcs){
            System.out.println(v);
        }

    }
}
