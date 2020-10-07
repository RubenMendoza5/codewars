package codewars.k8.functional;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcAvgTest {
    @Test
    public void testSomething() {
        final double DELTA = 1e-15;
        assertEquals(1, CalcAvg.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, CalcAvg.find_average(new int[]{1, 2, 3}), DELTA);
    }
}