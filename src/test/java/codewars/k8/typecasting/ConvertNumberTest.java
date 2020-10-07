package codewars.k8.typecasting;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumberTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertNumber.numberToString(67));
        assertEquals("123", ConvertNumber.numberToString(123));
        assertEquals("999", ConvertNumber.numberToString(999));
    }
}
