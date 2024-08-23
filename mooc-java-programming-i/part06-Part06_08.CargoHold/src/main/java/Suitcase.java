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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    //private int curr;
    
    public Suitcase(int w) {
        this.items = new ArrayList<>();
        this.maxWeight = w;
        //this.curr =0;
    }
    
    public void addItem(Item item){
        
        this.items.add(item);
        int currentWeight = totalWeight();
        if(currentWeight > this.maxWeight){
            this.items.remove(this.items.size()-1);
        }   
        
         
    }
    
    public void printItems(){
        
        for(Item item : this.items){
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight(){
        if(this.items.isEmpty()){
            return 0;
        }
        int currWeight=0;
        for(Item it : this.items){
            currWeight += it.getWeight();
        }
        return currWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heavy = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight() > heavy.getWeight()){
                heavy = item;
            }
        }
        return heavy;
    }
    
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.items.size() == 1){
            return "1 item (" + this.items.get(0).getWeight()+" kg)";
        }
        
        int itemCount = this.items.size();
        
        return itemCount + " items " + "("+totalWeight()+" kg)";   
    }
    
    
    
}
