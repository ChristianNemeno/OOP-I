
import java.util.Scanner;
import java.util.ArrayList;
public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> arr = new ArrayList<>();
        
        while(true){
            String yes = scanner.nextLine();
            if(yes.equals("")){
                break;
            }
            
            String[] yez = yes.split(",");
            arr.add(Integer.valueOf(yez[1]));
            
        }
        int max = arr.get(0);
        for(int i=1; i<arr.size();i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        System.out.println("Age of the oldest is: "+max);
    }
}
