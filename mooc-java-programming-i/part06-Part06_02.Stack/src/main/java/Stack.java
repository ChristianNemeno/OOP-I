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

public class Stack {
    
    private ArrayList<String> strings;
    
    public Stack(){
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.strings.size()== 0){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.strings.add(0,value);
    }
    
    public ArrayList<String> values(){
        return this.strings;
    }
    
    public String take(){
        String top = this.strings.get(0);
        this.strings.remove(0);
        return top;
    }
    
}
