
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter count = new Counter(2);
        
        count.increase(5);
        
        System.out.println(count);
        
        count.decrease(2);
        count.decrease();
        System.out.println(count);
        
    }
}
