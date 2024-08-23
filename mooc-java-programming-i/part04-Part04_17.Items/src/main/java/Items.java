
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String names = scanner.nextLine();
            if(names.isEmpty()){
                break;
            }
            items.add(new Item(names));
            
        }
        for(Item bro : items){
            System.out.println(bro.toString());
        }

    }
}
