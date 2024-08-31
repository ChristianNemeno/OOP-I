package Content;

import java.util.ArrayList;

public class Sheet {
    private final ArrayList<Student> studs;

    public Sheet(){
        studs = new ArrayList<>();
    }

    public void add(Student toAdd){
        this.studs.add(toAdd);
    }

    public void print(){
        for(Student x : this.studs) System.out.println(x);
    }

    public void present(int n){
        for(Student x : this.studs){
           if(x.getId() == n){
               x.setStatus(true);
           }
        }
    }


}
