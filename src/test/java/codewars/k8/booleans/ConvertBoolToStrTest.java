package codewars.k8.booleans;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBoolToStrTest {
    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBoolToStr.boolToWord(true),"Yes");
        assertEquals(ConvertBoolToStr.boolToWord(false),"No");
    }

}