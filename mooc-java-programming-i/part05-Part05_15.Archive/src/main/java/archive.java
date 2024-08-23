/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class archive {
    private String identifier; 
    private String name;

    public archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj){
            return true;
        }
        if(!(obj instanceof archive)){
            return false;
        }
        archive comp = (archive)obj;
        
        if(this.identifier.equals(comp.identifier)){
            return true;
        }
        
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.identifier+": "+this.name; //To change body of generated methods, choose Tools | Templates.
    }
}
