package ExceptionHandling.BankAcc;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(String message){
        super(message);
    }
}
