package Content;

public class Student extends Person{

    private final int id;
    private boolean status;

    public Student(String name, int id) {
        super(name);
        this.id = id;
        this.status = false;
    }

    public int getId() {
        return id;
    }


    public String getName(){
        return super.getName();
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        String statusString = status ? "Present" : "Absent";
        return "Student{" +
                "id=" + id +
                ", name=" + getName() + // Assuming the Person class has a getName() method
                ", status=" + statusString +
                '}';
    }
}
