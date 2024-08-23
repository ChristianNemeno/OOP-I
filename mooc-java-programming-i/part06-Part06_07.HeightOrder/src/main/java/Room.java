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

public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person temp = this.persons.get(0);
        for(Person p : this.persons){
            if(temp.getHeight() > p.getHeight()){
                temp = p;
            }
        }
        return temp;
    }
    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person dummy = this.shortest();
        this.persons.remove(this.shortest());
        return dummy;
    }
    
    
    
    
    
    
}
