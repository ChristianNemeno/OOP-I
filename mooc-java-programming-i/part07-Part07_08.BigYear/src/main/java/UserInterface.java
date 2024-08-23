/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Bird> birds;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner; 
        this.birds = new ArrayList<>();
        
    }
    
    public void face(){
        while(true){
            System.out.print("?");
            String input = scanner.nextLine();
            if(input.equals("Add")){
                //
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: "); 
                String nameLatin = scanner.nextLine();
                this.Add(name, nameLatin);
                
            }else if(input.equals("Observation")){
                //
                System.out.print("Bird? ");
                String nameBird = scanner.nextLine();
                this.Observation(nameBird);
                
            }else if(input.equals("All")){
                //
                this.All();
            }else if(input.equals("One")){
                //
                System.out.print("Bird? ");
                String nameBird = scanner.nextLine();
                
                this.One(nameBird);
            }else if(input.equals("Quit")){
                break;
            }
        }
    }
    public void Add(String name, String latin){
        this.birds.add(new Bird(name, latin));
    }
    public void Observation(String birdName){
        if(this.birds.isEmpty())return;
        boolean flag = false;
        for(Bird x : this.birds){
            if(x.getName().equals(birdName)){
               x.increment();
               flag = true;
            }
        }
        if(!flag){
            System.out.println("Not a bird!");
        }
        
    }
    public void All(){
        for(Bird x : this.birds){
            System.out.println(x);
            System.out.println("");
        }
    }
    public void One(String birdName){
        for(Bird x : this.birds){
            if(x.getName().equals(birdName)){
                System.out.println(x);
            }
        }
    }
    
    
}
