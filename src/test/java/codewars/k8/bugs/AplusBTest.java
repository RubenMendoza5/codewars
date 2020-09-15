package codewars.k8.bugs;

import codewars.k8.bugs.AplusB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AplusBTest {

    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, AplusB.sum(a, b));
    }
}