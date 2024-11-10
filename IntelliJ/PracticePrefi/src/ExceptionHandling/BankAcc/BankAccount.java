package ExceptionHandling.BankAcc;

import javax.management.MXBean;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isFrozen;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isFrozen = false;
    }

    public void deposit(double amount) throws NegativeAmountException, AccountFrozenException, MaximumDepositException {
        // TODO: Implement deposit logic
        // Requirements:
        // 1. Amount must be positive
        // 2. Cannot deposit if account is frozen
        // 3. Maximum single deposit amount is $10,000
        // 4. Handle all error cases with appropriate exceptions
        if(amount < 0){
            throw new NegativeAmountException("Amount must be positive");
        }

        if(isFrozen){
            throw new AccountFrozenException("Cannot deposit if account is frozen");
        }

        if(amount > 10000){
            throw new MaximumDepositException("Maximum single deposit is 10,000");
        }

        balance += amount;




    }

    public void withdraw(double amount) throws NegativeAmountException, AccountFrozenException, InsufficientFundsException {
        // TODO: Implement withdraw logic
        // Requirements:
        // 1. Amount must be positive
        // 2. Cannot withdraw if account is frozen
        // 3. Cannot withdraw more than available balance
        // 4. Maximum single withdrawal amount is $5,000
        // 5. Handle all error cases with appropriate exceptions
        if(amount < 0){
            throw new NegativeAmountException("Amount must be positive");
        }
        if(isFrozen){
            throw new AccountFrozenException("Cannot withdraw if account is frozen");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Cannot withdraw more than available balance");
        }

        balance -= amount;

    }

    public void freezeAccount() {
        this.isFrozen = true;
    }

    public double getBalance() {
        return balance;
    }
}