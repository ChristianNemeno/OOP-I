package old;

public class Employee implements Comparable<Employee> {
    protected int id;
    protected String name;
    protected int age;
    protected  double salary;


    public Employee(int id,String name, int age, double salary){
        this.id=id;
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee that){
        return this.age - that.age;
    }

    @Override
    public String toString() {
        return "old.Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
