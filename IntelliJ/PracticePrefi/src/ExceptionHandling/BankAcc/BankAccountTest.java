package ExceptionHandling.BankAcc;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testValidDeposit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.deposit(500.0);
            assertEquals(1500.0, account.getBalance(), 0.01);
        } catch (Exception e) {
            fail("Should not throw exception for valid deposit");
        }
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.deposit(-100.0);
            fail("Should throw exception for negative deposit");
        } catch (IllegalArgumentException | NegativeAmountException | AccountFrozenException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        } catch (MaximumDepositException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDepositOverMaximumLimit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.deposit(15000.0); // Over $10,000 limit
            fail("Should throw exception for deposit over maximum limit");
        } catch (IllegalArgumentException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        } catch (NegativeAmountException e) {
            throw new RuntimeException(e);
        } catch (AccountFrozenException e) {
            throw new RuntimeException(e);
        } catch (MaximumDepositException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDepositToFrozenAccount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.freezeAccount();
        try {
            account.deposit(500.0);
            fail("Should throw exception for deposit to frozen account");
        } catch (IllegalStateException | NegativeAmountException | AccountFrozenException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        } catch (MaximumDepositException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidWithdrawal() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.withdraw(500.0);
            assertEquals(500.0, account.getBalance(), 0.01);
        } catch (Exception e) {
            fail("Should not throw exception for valid withdrawal");
        }
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.withdraw(1500.0);
            fail("Should throw exception for insufficient funds");
        } catch (IllegalStateException | NegativeAmountException | AccountFrozenException | InsufficientFundsException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        }
    }

    @Test
    public void testNegativeWithdrawal() {
        BankAccount account = new BankAccount("12345", 1000.0);
        try {
            account.withdraw(-100.0);
            fail("Should throw exception for negative withdrawal");
        } catch (IllegalArgumentException | NegativeAmountException | AccountFrozenException |
                 InsufficientFundsException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        }
    }

    @Test
    public void testWithdrawOverMaximumLimit() {
        BankAccount account = new BankAccount("12345", 10000.0);
        try {
            account.withdraw(6000.0); // Over $5,000 limit
            fail("Should throw exception for withdrawal over maximum limit");
        } catch (IllegalArgumentException | NegativeAmountException | AccountFrozenException |
                 InsufficientFundsException e) {
            assertEquals(10000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        }
    }

    @Test
    public void testWithdrawFromFrozenAccount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.freezeAccount();
        try {
            account.withdraw(500.0);
            fail("Should throw exception for withdrawal from frozen account");
        } catch (IllegalStateException | NegativeAmountException | AccountFrozenException | InsufficientFundsException e) {
            assertEquals(1000.0, account.getBalance(), 0.01);
            // Balance should remain unchanged
        }
    }
}