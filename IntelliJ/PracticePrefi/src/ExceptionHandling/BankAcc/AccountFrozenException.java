package ExceptionHandling.BankAcc;

public class AccountFrozenException extends Exception{

    public AccountFrozenException(String message){
        super(message);
    }
}
