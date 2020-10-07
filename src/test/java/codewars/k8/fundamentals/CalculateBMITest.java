package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateBMITest {
    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }
}