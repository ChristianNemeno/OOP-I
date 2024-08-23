
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Stats> myList = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] csv = line.split(",");
                
                myList.add(new Stats(csv[0],csv[1],Integer.valueOf(csv[2]),Integer.valueOf(csv[3])));
                
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int count =0;
        int wins =0;
        for(int i=0; i<myList.size(); i++){
            Stats temp = myList.get(i);
            if(temp.getHome().equals(team)){
                count++;
                if(temp.getHomePoints() > temp.getVisitPoints()){
                    wins = wins + 1;
                }   
                
            }
            
            if(temp.getVisit().equals(team)){
                count++;
                if(temp.getVisitPoints() > temp.getHomePoints()){
                    wins = wins + 1;
                }
                
            }
        }
        
        
        System.out.println("Games: " + count);
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: " + (count-wins));
        
        
            
    }
    
    

}
