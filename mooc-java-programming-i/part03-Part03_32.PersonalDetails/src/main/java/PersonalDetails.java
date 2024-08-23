
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> years = new ArrayList<>();
        ArrayList <String> names = new ArrayList<>();
        
        while(true){
            String sad = scanner.nextLine();
            if(sad.equals("")){
                break;
            }
            
            String[] sepa = sad.split(",");
            names.add(sepa[0]);
            years.add(Integer.valueOf(sepa[1]));
            
        }
        int max = names.get(0).length();
        int index=0;
        for(int i=1; i<names.size();i++){
            if(names.get(i).length()>max){
                max = names.get(i).length();
                index = i;
            }
        }
        System.out.println("Longest name: "+ names.get(index));
        
        double sum=0;
        for(int i=0; i<years.size();i++){
            sum+= years.get(i);
        }
        double average = sum / (double)years.size();
        System.out.println("Average of birth years: "+average);

    }
}
