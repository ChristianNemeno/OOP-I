public class Student extends Person {

    private String book;

    public Student(String name, String type, int code ,String book){
        super(name,type,code);
        this.book = book;

    }


    public void sayName(){


        System.out.println(name);
    }

}
