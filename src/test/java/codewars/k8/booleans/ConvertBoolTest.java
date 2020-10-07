package codewars.k8.booleans;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBoolTest {

    @Test public void testTrue(){
        assertEquals(ConvertBool.convert(true), "true");
    }

    @Test
    public void testFalse(){
        assertEquals(ConvertBool.convert(false), "false");
    }

}