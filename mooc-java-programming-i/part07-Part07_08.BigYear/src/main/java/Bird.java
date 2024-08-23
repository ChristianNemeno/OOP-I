/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.HashMap;

public class Bird {
    private String name;
    private String latin;
    private int observation;

    public Bird(String name , String latin) {
     this.latin = latin;
     this.name = name;
     this.observation =0;
    }


    public void setObservation(int observation) {
        this.observation = observation;
    }

    public int getObservation() {
        return observation;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }
    public void increment(){
        this.observation++;
    }
    
    public String toString(){
        return this.name + " (" + this.latin + "): " + this.observation + " observations"; 
    } 
    
    
    
    
    
}
