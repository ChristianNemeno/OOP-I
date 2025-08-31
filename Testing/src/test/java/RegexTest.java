package test.java;

import Regex.basic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {

    @Test
    public void testContainsSad(){
        String input = "I am not sad today";
        assertTrue(basic.containsSad(input));
    }
}
