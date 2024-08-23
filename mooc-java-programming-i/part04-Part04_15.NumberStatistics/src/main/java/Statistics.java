
import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
        // initialize the variables count and sum here
    }
    
    public void addNumber(int number) {
        this.count = this.count +1;
        this.sum = this.sum + number;
        
        // write code here
    }

    public int getCount() {
        return this.count;
        // write code here
    }

    public int sum() {
        return this.sum;
        // write code here
    }

    public double average() {
        int c = this.count;
        double average =0;
        if(c <= 0){
            return average;
        }
        average = this.sum /(double)c;
        return average;
// write code here
    }
}