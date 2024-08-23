
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAcc = new Account("chris", 100.00);
        myAcc.deposit(20.0);
        
        System.out.println(myAcc.toString());
    }
}
