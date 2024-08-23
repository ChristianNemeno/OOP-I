
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <String> names = new ArrayList<>();
        while(true){
            String yes = scanner.nextLine();
            if(yes.equals("")){
                break;
            }
            
            String[] yez = yes.split(",");
            arr.add(Integer.valueOf(yez[1]));
            names.add(yez[0]);
        }
        int max = arr.get(0);
        int index=0;
        for(int i=1; i<arr.size();i++){
            if(arr.get(i)>max){
                max = arr.get(i);
                index = i;
            }
        }
        System.out.println("Name of the oldest: "+names.get(index));


    }
}
