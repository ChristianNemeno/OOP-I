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
public class Hold {
   private int maxWeight;
   private ArrayList<Suitcase> hold;
    
    public Hold(int m) {
        this.maxWeight = m;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int total =0;
        this.hold.add(suitcase);
        for(Suitcase suitcases : this.hold){
            total += suitcase.totalWeight();
        }
        if(total > maxWeight){
            this.hold.remove(this.hold.size()-1);
        }
    }
    
    public String toString(){
      int total=0;
      for(Suitcase cases : this.hold){ 
          total += cases.totalWeight();
      }
        
      return this.hold.size() + " suitcases " + "("+total+" kg)";
        
    }
    public void printItems(){
        for(Suitcase cases : this.hold){
            cases.printItems();
        }
    }
    
    
    
    
    
   
   
   
}
