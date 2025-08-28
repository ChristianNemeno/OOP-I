package test.java;

import Util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void testAdd(){
        int result = c.add(10,20);

        assertEquals(30, result);
    }
}
