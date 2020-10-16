package codewars.k8.mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryTest {
    @Test
    public void testToBinary() {
        assertEquals(1, ConvertBinary.toBinary(1));
        assertEquals(10, ConvertBinary.toBinary(2));
        assertEquals(11, ConvertBinary.toBinary(3));
        assertEquals(101, ConvertBinary.toBinary(5));
    }

}