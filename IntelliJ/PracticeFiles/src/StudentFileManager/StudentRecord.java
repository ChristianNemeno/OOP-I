package StudentFileManager;



public class StudentRecord {
     String name;
     int id;
     double gpa;

    public StudentRecord(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%.2f", id, name, gpa);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StudentRecord)) return false;
        StudentRecord other = (StudentRecord) obj;
        return this.id == other.id &&
                this.name.equals(other.name) &&
                Math.abs(this.gpa - other.gpa) < 0.001;
    }
}