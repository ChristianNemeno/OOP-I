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
public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
   
    
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
      
    }
    
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for(Exercise every : exercises){
            list.add(every.getName());
        }
        
        return list;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for(Exercise cise : exercises){
            if(cise.getName().equals(exercise)){
                cise.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for(Exercise ise : exercises){
            if(ise.getName().equals(exercise)){
                return ise.isCompleted();
            }
        }
        return false;
    }
}
