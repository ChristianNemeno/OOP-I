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

    public String print() {
        StringBuilder builder = new StringBuilder();
        for (Student student : studs) {
            builder.append(student).append("\n");
        }
        return builder.toString();
    }

    public void present(int n){
        for(Student x : this.studs){
           if(x.getId() == n){
               x.setStatus(true);
           }
        }
    }


}
