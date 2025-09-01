package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Entity.Student;

public class StudentTransactionTest {
    Student student = new Student(1, "Christian");

    @Test
    public void studentInitialBalance() {

        assertEquals(100, student.getWallet().getAmount());
    }
    @Test
    public void studentSpend(){
        student.spend(10);
        assertEquals(90, student.getWallet().getAmount());
    }
}
