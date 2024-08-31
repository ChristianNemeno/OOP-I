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





    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
