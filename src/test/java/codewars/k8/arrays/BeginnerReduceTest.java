package codewars.k8.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeginnerReduceTest {
    @Test
    public void testSomething() {
        assertEquals(6, BeginnerReduce.grow(new int[]{1,2,3}));
        assertEquals(16, BeginnerReduce.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, BeginnerReduce.grow(new int[]{2,2,2,2,2,2}));
    }
}
