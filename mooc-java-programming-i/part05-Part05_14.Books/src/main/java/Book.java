
import java.util.ArrayList;


public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }
        if(!(compare instanceof Book)){
            return false;
        }
        Book myBook = (Book)compare;
        
        if(this.name.equals(myBook.name) &&
           this.publicationYear == myBook.publicationYear){
            return true;
        }
        return false;
    }
    

}
