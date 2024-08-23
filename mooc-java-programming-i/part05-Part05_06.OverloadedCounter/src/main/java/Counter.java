/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Counter {
    private int value;
    
    public Counter(int value){
        this.value = value;
    }
    public Counter(){
        this(0);
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value = this.value + 1;
    }
    
    public void decrease(){
        this.value = this.value - 1;
    }
    
    public void increase(int set){
        if(set > 0){
        this.value = this.value + set;
        }
    }
    
    public void decrease(int set){
        if(set>0){
        this.value = this.value - set;
        }
    }
    @Override
    public String toString(){
        return "Current count is " + this.value;
    }
    
    
}
