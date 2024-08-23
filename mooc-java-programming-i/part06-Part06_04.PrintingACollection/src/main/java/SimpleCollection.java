
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int count;
    
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.count = 0;
    }

    public void add(String element) {
        this.elements.add(element); 
        this.count++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    
    public String toString() {
        if(this.count == 0){
            return  "The collection "+ this.name +" is empty.";
        }
        if(this.count == 1){
            return "The collection "+ this.name +" has "+ count +" element:\n" + elements.get(0);
        }
        String result = "";
        for(String sad : elements){
            result = result + sad + "\n";
        }
        
        return "The collection "+this.name+" has " + count + " elements:\n" + result; 
    }
    
    
}
