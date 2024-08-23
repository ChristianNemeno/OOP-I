
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        
        
        //SimpleDate bday = new SimpleDate(4,9,2003);
        //SimpleDate bday2 = new SimpleDate(4,9,2003);
        
        Person person = new Person("chris", new SimpleDate(4,9,2003), 162, 63);
        Person person2 = new Person("chris", new SimpleDate(4,9,2003), 162, 63);
        
        if(person.equals(person2)){
            System.out.println("They are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
